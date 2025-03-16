package org.wikipedia.homeworks.homework13

import androidx.test.espresso.action.ViewActions.swipeLeft
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.web.webdriver.Locator
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.R
import org.wikipedia.homeworks.homework03.OnboardingScreen
import org.wikipedia.homeworks.homework07.ExploreScreen
import org.wikipedia.homeworks.homework07.ListCardList
import org.wikipedia.homeworks.homework07.TopReadCardView
import org.wikipedia.main.MainActivity

class HwTest : TestCase() {

    @get:Rule
    val activityScenarioRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleTest() {
        run {
            step("Нажимает кнопку Skip") {
                OnboardingScreen.skipButton.click()
            }

            step("Проскроллить TopRead, перейти") {
                ExploreScreen.items.childAt<TopReadCardView>(4) {
                    cardListContainerItems.childAt<ListCardList>(1) {
                        viewListCardItemImage.click()
                    }
                }
            }
            Side.view.perform(swipeLeft())

            step("References") {
                Side { webView { withElement(Locator.ID, "References") {
                            scroll()
                            hasText("References")
                        }
                    }
                }
            } }
        }}
