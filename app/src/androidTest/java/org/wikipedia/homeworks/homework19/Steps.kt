package org.wikipedia.homeworks.homework19

import com.kaspersky.kaspresso.device.Device
import com.kaspersky.kaspresso.testcases.core.testcontext.TestContext
import io.github.kakaocup.kakao.common.actions.BaseActions
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.text.KButton


class Steps (val testContext : TestContext<*>){

    operator fun invoke(function: Steps.() -> Unit){
        function()
    }

    fun click(item : BaseActions,name:String){
        testContext.step("Нажимает на элемент '$name'"){
            item.click()
        }
    }
    fun visibleButton(item:KButton, name: String){
        testContext.step("Находит видимость'$name'") {
            item.isVisible()
        }
    }
    fun deviceMob(item: Device, name: String){
        testContext.step("Нажимает системную кнопку'$name'"){
        item.uiDevice.pressBack()
        }
    }
}