package org.wikipedia.homeworks.homework20

import com.kaspersky.kaspresso.testcases.core.testcontext.TestContext
import com.kaspersky.kaspresso.testcases.models.info.StepInfo
import io.github.kakaocup.kakao.common.actions.BaseActions
import io.github.kakaocup.kakao.common.assertions.BaseAssertions

class NamedSteps(val testContext: TestContext<*>) {

    private fun execute(stepText: String, actions: (StepInfo) -> Unit) {
        testContext.step(stepText, actions)
    }

    operator fun invoke(function: NamedSteps.() -> Unit) {
        function()
    }

    fun click(item: BaseActions) {
        testContext.step("Нажимаем на элемент '${item.getName()}'") {
            item.click()
        }
    }

    fun isVisible(item: BaseAssertions) {
        val name = (item as? BaseActions)?.getName() ?: "Неизвестный элемент"
        testContext.step("Проверяем видимость элемента $name") {
            item.isVisible()
        }
    }
}