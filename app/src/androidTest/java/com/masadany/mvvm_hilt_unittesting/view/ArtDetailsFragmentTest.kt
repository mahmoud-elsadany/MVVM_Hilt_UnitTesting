package com.masadany.mvvm_hilt_unittesting.view

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.filters.MediumTest
import com.google.common.truth.Truth.assertThat
import com.masadany.mvvm_hilt_unittesting.R
import com.masadany.mvvm_hilt_unittesting.getOrAwaitValueTest
import com.masadany.mvvm_hilt_unittesting.launchFragmentInHiltContainer
import com.masadany.mvvm_hilt_unittesting.repo.FakeArtRepositoryTest
import com.masadany.mvvm_hilt_unittesting.viewmodel.ArtViewModel
import com.masadany.roomdb.Art
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import javax.inject.Inject


@MediumTest
@HiltAndroidTest
@ExperimentalCoroutinesApi
class ArtDetailsFragmentTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Inject
    lateinit var fragmentFactory: ArtFragmentFactory

    @Before
    fun setup() {
        hiltRule.inject()
    }

    @Test
    fun testNavigationFromArtDetailsToImageAPI() {
        val navController = Mockito.mock(NavController::class.java)

        launchFragmentInHiltContainer<ArtDetailsFragment>(
            factory = fragmentFactory
        ) {
            Navigation.setViewNavController(requireView(), navController)
        }



        Espresso.onView(ViewMatchers.withId(R.id.artImageView)).perform(click())

        Mockito.verify(navController).navigate(
            R.id.imageApiFragment
        )
    }

    @Test
    fun testOnBackPressed() {
        val navController = Mockito.mock(NavController::class.java)

        launchFragmentInHiltContainer<ArtDetailsFragment>(
            factory = fragmentFactory
        ) {
            Navigation.setViewNavController(requireView(), navController)
        }

        Espresso.pressBack()

        Mockito.verify(navController).popBackStack()
    }

    @Test
    fun testSaveScenario() {

        val testViewModel = ArtViewModel(FakeArtRepositoryTest())


        launchFragmentInHiltContainer<ArtDetailsFragment>(
            factory = fragmentFactory
        ) {
            viewModel = testViewModel
        }

        Espresso.onView(withId(R.id.nameText)).perform(replaceText("Lisa"))
        Espresso.onView(withId(R.id.artistText)).perform(replaceText("ahmed"))
        Espresso.onView(withId(R.id.yearText)).perform(replaceText("1900"))


        Espresso.onView(withId(R.id.saveButton)).perform(click())


        assertThat(testViewModel.artList.getOrAwaitValueTest()).contains(
            Art(
                "Lisa",
                "ahmed",
                1900,
                ""
            )
        )
    }

}