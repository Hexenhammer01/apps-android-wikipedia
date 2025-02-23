package org.wikipedia.homeworks.homework08.Items

import android.view.View
import androidx.compose.foundation.layout.WindowInsets
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class OnbordingFrameItem(matcher: Matcher<View>) : KRecyclerItem<OnbordingFrameItem>(matcher) {

    val wikiImageCentered = KImageView(matcher){
        withId(R.id.imageViewCentered)
    }
    val primaryText = KTextView(matcher){
        withId(R.id.primaryTextView)
    }
    val secondaryText = KTextView(matcher){
        withId(R.id.secondaryTextView)
    }

    val languageFrame = KRecyclerView(
        parent = matcher,
        builder = {
            withId(R.id.languagesList)
        },
        itemTypeBuilder = {
            itemType (::LanguageViewItem)
        }
    )
    val addButton = KButton(matcher){
        withId(R.id.addLanguageButton)
    }

}