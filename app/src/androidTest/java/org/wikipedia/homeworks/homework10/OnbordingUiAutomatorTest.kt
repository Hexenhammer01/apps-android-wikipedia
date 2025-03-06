package org.wikipedia.homeworks.homework10

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity

class OnbordingUiAutomatorTest : TestCase() {
    @get:Rule
    val activityScenarioRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun onbordingTest() {
        run {
            OnbordingUiScreen.image.isDisplayed()
            OnbordingUiScreen.title.isDisplayed()
            OnbordingUiScreen.secTitle.isDisplayed()
            OnbordingUiScreen.addLanguage.isDisplayed()
            OnbordingUiScreen.skipButton.isDisplayed()
            OnbordingUiScreen.continueButton.click()

        }
    }
}