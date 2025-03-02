package org.wikipedia.homeworks.homework08.Items

import android.view.View
import androidx.compose.foundation.layout.WindowInsets
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.pager2.KViewPager2
import io.github.kakaocup.kakao.pager2.KViewPagerItem
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class OnbordingFrameItem(matcher1: Matcher<View>) : KViewPagerItem<OnbordingFrameItem>(matcher1) {

    val wikiImageCentered = KImageView(matcher1){
        withId(R.id.imageViewCentered)
    }
    val primaryText = KTextView(matcher1){
        withId(R.id.primaryTextView)
    }
    val secondaryText = KTextView(matcher1){
        withId(R.id.secondaryTextView)
    }

    val languageFrame = KViewPager2(
        parent = matcher1,
        builder = {
            withId(R.id.languagesList)
        },
        itemTypeBuilder = {
            itemType (::LanguageViewItem)
        }
    )
    val addButton = KButton(matcher1){
        withId(R.id.addLanguageButton)
    }

}