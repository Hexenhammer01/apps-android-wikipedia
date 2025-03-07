package org.wikipedia.homeworks.homework10

import android.annotation.SuppressLint
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.swipeRight
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.components.kautomator.component.common.actions.UiSwipeableActions
import com.kaspersky.components.kautomator.component.switch.UiSwitchableActions
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

    @Test
    fun firstViewElements() {
        run {
            step("Определение картинки") {
                OnbordingUiScreen.image.isDisplayed()
            }
            step("Определение title") {
                OnbordingUiScreen.title.isDisplayed()
            }
            step("Определение underTitle") {
                OnbordingUiScreen.underTitle.isDisplayed()
            }
            step("Определение экрана добавления языка'") {
                OnbordingUiScreen.addLanguage.isDisplayed()
            }
            step("Отображение кнопки Skip") {
                OnbordingUiScreen.skipButton.isDisplayed()
            }
            step("Отображение кнопки продолжить") {
                OnbordingUiScreen.continueButton.isDisplayed()
            }
        }
    }

    @Test
    fun getStartButton() {
        run {
            step("Нажатие на продолжить ") {
                OnbordingUiScreen.continueButton.click()
            }
//            step("Свайп") {
//                OnbordingUiScreen.swipe.swipeRight()
//            }
            step("Нажатие на продолжить ") {
                OnbordingUiScreen.continueButton.click()
            }
            step("Нажатие на продолжить ") {
                OnbordingUiScreen.continueButton.click()
            }
            step("Отображение кнопки getStart ") {
                OnbordingUiScreen.getStartedButton.isDisplayed()
            }
        }
    }

    @Test
    fun secondViewElements() {
        run {
            step("Нажатие на продолжить") {
                OnbordingUiScreen.continueButton.click()
            }
            step("Определение картинки") {
                OnbordingUiScreen.image.isDisplayed()
            }
            step("Отображение title") {
                OnbordingUiScreen.secTitle.isDisplayed()
            }
            step("Отображение sec under title") {
                OnbordingUiScreen.underSecTitle.isDisplayed()
            }
        }
    }
}

