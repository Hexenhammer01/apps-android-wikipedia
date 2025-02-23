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
}