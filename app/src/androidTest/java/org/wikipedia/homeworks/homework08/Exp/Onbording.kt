package org.wikipedia.homeworks.homework08.Exp

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KButton
import org.wikipedia.R
import org.wikipedia.homeworks.homework08.Items.OnbordingFrameItem

object Onbording: KScreen<Onbording>() {
    override val layoutId = R.layout.fragment_onboarding_pager
    override val viewClass = null


    val continueButton = KButton{
        withId(R.id.fragment_onboarding_forward_button)
    }

    val skipButton= KButton{
        withId(R.id.fragment_onboarding_skip_button)
    }
    val indicator = KView{
        withId(R.id.view_onboarding_page_indicator)
    }
    val getStartButton = KButton{
        withId(R.id.fragment_onboarding_done_button)
    }
    val items1 = KRecyclerView(
        builder = {
            withId(R.id.fragment_pager)
        },
        itemTypeBuilder = {
            itemType(::OnbordingFrameItem)
        }

    )

}
