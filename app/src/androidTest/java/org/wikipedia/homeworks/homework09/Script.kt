package org.wikipedia.homeworks.homework09

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.components.alluresupport.withForcedAllureSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.R
import org.wikipedia.homeworks.homework03.OnboardingScreen
import org.wikipedia.homeworks.homework07.ExploreScreen
import org.wikipedia.homeworks.homework07.ExploreScreen.items
import org.wikipedia.homeworks.homework07.NewsCardsView
import org.wikipedia.homeworks.homework07.NewsItemViewsItem
import org.wikipedia.homeworks.homework07.NewsScreen
import org.wikipedia.homeworks.homework07.NewsScreenTtem
import org.wikipedia.homeworks.homework07.SecObj
import org.wikipedia.homeworks.homework07.TopReadCardView
import org.wikipedia.homeworks.homework21.CustomViewAction
import org.wikipedia.main.MainActivity

class Script : TestCase(Kaspresso.Builder.withForcedAllureSupport()) {

    @get:Rule
    val activityScenarioRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun script() {
        run {
            step("Нажимает кнопку Skip") {
                OnboardingScreen.skipButton.view.perform(CustomViewAction())
            }
                items.childWith<NewsCardsView> {
                    withDescendant {
                        withText(R.string.view_card_news_title)
                    }
                }.invoke {
                    step("Листаем до третьей картинки и кликаем по ней") {
                        items.childAt<NewsCardsView>(2) {
                            click()
                        }
                    }
                }
//            NewsScreen.items
//                    .childAt<NewsScreenTtem>(1) {
//                        step("Кликаем по второй статье из списка") {
//                            title.click()
//                        }
//            }
//            step("Проверяем, что отображается элемент с ID page_web_view") {
//                SecObj.page.isVisible()
//            }
        }
    }
}