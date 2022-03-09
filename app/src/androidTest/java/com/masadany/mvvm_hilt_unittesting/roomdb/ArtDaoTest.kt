package com.masadany.mvvm_hilt_unittesting.roomdb

import android.app.Application
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.filters.SmallTest
import com.google.common.truth.Truth.assertThat
import com.masadany.mvvm_hilt_unittesting.getOrAwaitValueTest
import com.masadany.roomdb.Art
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@SmallTest
@ExperimentalCoroutinesApi
class ArtDaoTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var database: ArtDatabase
    private lateinit var dao: ArtDao

    @Before
    fun setup() {
        //database run on ram memory on one maint hread
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            ArtDatabase::class.java
        ).allowMainThreadQueries().build()


        dao = database.artDao()
    }


    @After
    fun teardown(){
        database.close()
    }

    //use the run blocking test to make it run in queue not in multi thread
    @Test
    fun insertArtTesting() = runBlockingTest{
        val exampleArt = Art("Mona lisa","artist 1",1900,"test.com",1)
        dao.insertArt(exampleArt)

        val list = dao.observeArts().getOrAwaitValueTest()

        assertThat(list).contains(exampleArt)

    }

    @Test
    fun deleteArtTesting() = runBlockingTest{

        val exampleArt = Art("Mona lisa2","artist 2",1900,"test2.com",2)
        dao.insertArt(exampleArt)

        val list = dao.observeArts().getOrAwaitValueTest()

        assertThat(list).contains(exampleArt)

        dao.deleteArt(exampleArt)
        val list2 = dao.observeArts().getOrAwaitValueTest()

        assertThat(list2).doesNotContain(exampleArt)

    }

}