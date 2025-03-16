package org.wikipedia.homeworks.homework13

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.web.KWebView
import org.wikipedia.R

object ArtScWe: KScreen<ArtScWe>()  {
    override val layoutId = null
    override val viewClass=null

    val web = KWebView{
        withId(R.id.page_web_view)
    }
}