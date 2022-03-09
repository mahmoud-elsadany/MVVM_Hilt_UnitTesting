package com.masadany.artbooknavigation.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.common.truth.Truth.assertThat
import com.masadany.artbooknavigation.MainCoroutineRule
import com.masadany.artbooknavigation.getOrAwaitValueTest
import com.masadany.artbooknavigation.repo.FakeArtRepository
import com.masadany.mvvm_hilt_unittesting.util.Status
import com.masadany.mvvm_hilt_unittesting.viewmodel.ArtViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class ArtViewModelTest {

    //run all in one thread
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()


    //change asyncrouns data
    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    private lateinit var viewModel: ArtViewModel

    @Before
    fun setup(){
        //Test the Fake repo to do unit test on viewmodel without adding or deleting in the model
        viewModel = ArtViewModel(FakeArtRepository())
    }

    @Test
    fun `insert art without year returns error`(){
        viewModel.makeArt("monalisa","ddd","")

        val value = viewModel.insertArtMessage.getOrAwaitValueTest()

        assertThat(value.status).isEqualTo(Status.ERROR)

    }


    @Test
    fun `insert art without artistName returns error`(){
        viewModel.makeArt("monalisa","","1900")

        val value = viewModel.insertArtMessage.getOrAwaitValueTest()

        assertThat(value.status).isEqualTo(Status.ERROR)

    }

    @Test
    fun `insert art without name returns error`(){
        viewModel.makeArt("","ddd","1900")

        val value = viewModel.insertArtMessage.getOrAwaitValueTest()

        assertThat(value.status).isEqualTo(Status.ERROR)
    }
}