package org.wikipedia.homeworks.homework08

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.homeworks.homework03.OnboardingScreen
import org.wikipedia.homeworks.homework07.ExploreScreen
import org.wikipedia.homeworks.homework07.ListCardList
import org.wikipedia.homeworks.homework07.SerchCardViewItem
import org.wikipedia.homeworks.homework07.TopReadCardView
import org.wikipedia.main.MainActivity
import org.wikipedia.homeworks.homework08.Exp.Onbording
import org.wikipedia.homeworks.homework08.Items.OnbordingFrameItem as OnbordingFrameItem

class ExploreScreenTests : TestCase() {

    @get:Rule
    val activityScenarioRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleTest() {
        run {
            step("Нажимает кнопку Skip") {
                OnboardingScreen.skipButton.click()
            }
            step("Проверяет отображение тулбара") {
                ExploreScreen.toolbarTitle.isDisplayed()
            }
            step("Нажатие на иконку поиска") {
                ExploreScreen.items.childAt<SerchCardViewItem>(0) {
                    voiceSearchView.isDisplayed()

                }
            }
            step("Проскроллить TopRead, проверить отображение картинки") {
                ExploreScreen.items.childAt<TopReadCardView>(4) {
                    cardListContainerItems.childAt<ListCardList>(1) {
                        viewListCardItemImage.isDisplayed()
                    }
                }
            }
        }
    }

    @Test
    fun wikiLogoCheck(){
        run {
            step("Отображение логотипа"){
                Onbording.items1.childAt<OnbordingFrameItem>( 0){
                    wikiImageCentered.isDisplayed()
                }
            }
        }
    }
    @Test
    fun secondPage(){
        run{
            step("Перелистывание"){
                Onbording.continueButton.click()
            }
        }
    }
    @Test
    fun skipButton(){
        run{
            step("Пропустить"){
                Onbording.skipButton.click()
            }
        }
    }
    @Test
    fun startButton(){
        run {
            step("Нажатие старт"){
                Onbording.continueButton.click()
                Onbording.continueButton.click()
                Onbording.continueButton.click()
                Onbording.getStartButton.isDisplayed()
                Onbording.getStartButton.click()
            }
        }
    }
    @Test
    fun addLanguage(){
        run{
            step("Нажатие Добавить язык"){
                Onbording.items1.childAt<OnbordingFrameItem>(0){
                    addButton.click()
                }
            }
        }
    }
}