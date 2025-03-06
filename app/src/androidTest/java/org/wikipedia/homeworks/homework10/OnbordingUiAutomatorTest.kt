package org.wikipedia.homeworks.homework10

import android.annotation.SuppressLint
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.swipeRight
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.components.kautomator.component.common.actions.UiSwipeableActions
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import okhttp3.internal.wait
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity

class OnbordingUiAutomatorTest : TestCase() {
    @get:Rule
    val activityScenarioRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @SuppressLint("CheckResult")
    @Test
    fun onbordingTest() {
        run {
            OnbordingUiScreen {
                image.isDisplayed()
                title.isDisplayed()
                underTitle.isDisplayed()
                addLanguage.isDisplayed()
                skipButton.isDisplayed()
                continueButton.click()
                image.isDisplayed()
                secTitle.isDisplayed()
                underSecTitle.isDisplayed()
            }
        }
    }
}