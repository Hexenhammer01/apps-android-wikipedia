package org.wikipedia.homeworks.homework11

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.uiautomator.UiSelector
import com.kaspersky.kaspresso.device.exploit.Exploit
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.homeworks.homework10.OnbordingUiScreen
import org.wikipedia.main.MainActivity
import java.util.Locale

class DeviceTest : TestCase() {
    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun deviceTest() {
        before {
            device.network.disable()
        }.after {
            device.network.enable()
            device.language.switchInApp(Locale.ENGLISH)
            device.exploit.setOrientation(Exploit.DeviceOrientation.Portrait)
        }.run {

//            device.uiDevice.findObject(UiSelector().text("").index(23))
            Thread.sleep(3000)
            device.exploit.setOrientation(Exploit.DeviceOrientation.Landscape)
            device.language.switchInApp(Locale.FRANCE)
            adbServer

            Thread.sleep(3000)


        }
    }

    @Test
    fun homeTest() {
        before {


        }.after {
            device.network.enable()
            device.exploit.setOrientation(Exploit.DeviceOrientation.Portrait)
            device.uiDevice.wakeUp()
            device.language.switchInApp(Locale.ENGLISH)
        }.run {
            step("Изменение ориентации") {
                device.exploit.setOrientation(Exploit.DeviceOrientation.Landscape)
            }
            step("Выключение сети") {
                device.network.disable()
            }
            step("Проверка ориентации") {
                device.uiDevice.isNaturalOrientation
            }
            step("Засыпание") {
                device.uiDevice.sleep()
            }
            step("Подъем!") {
                device.uiDevice.wakeUp()
            }
            step("Определение картинки") {
                OnbordingUiScreen.image.isDisplayed()
            }

            step("Нажатие на  Skip") {
                OnbordingUiScreen.skipButton.click()
            }
            step("Изменение ориентации") {
                device.exploit.setOrientation(Exploit.DeviceOrientation.Portrait)
            }
            step("Проверка ошибки и кнопки"){
                OfflineCardViewItem.retryButton.isDisplayed()
                OfflineCardViewItem.retryButton.click()
            }
            step("Смена языка") {
                device.language.switchInApp(Locale.FRANCE)
            }
            step("main Activity"){
                device.activities.isCurrent(MainActivity::class.java)
            }

        }
    }
}
//java -jar adbserver-desktop.jar
