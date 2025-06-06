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
            step("Свайп") {
                OnbordingUiScreen.swipe.swipeLeft(0.7f)
            }
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
    @Test
    fun thirdViewElements(){
        run {
            step("Нажатие на продолжить") {
                OnbordingUiScreen.continueButton.click()
            }
            step("Нажатие на продолжить") {
                OnbordingUiScreen.continueButton.click()
            }
            step("Отображение sec under title") {
                OnbordingUiScreen.underSecTitle.isDisplayed()
            }
            step("Отображение картинки"){
                OnbordingUiScreen.image.isDisplayed()
            }
            step("Отображение title"){
                OnbordingUiScreen.thirdTitle.isDisplayed()
            }
            step("Отображение under title"){
                OnbordingUiScreen.underTrhirdTitle.isDisplayed()
            }
        }
    }
}

