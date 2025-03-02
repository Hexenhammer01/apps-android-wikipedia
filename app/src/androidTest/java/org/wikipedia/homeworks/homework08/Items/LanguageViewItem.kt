package org.wikipedia.homeworks.homework08.Items

import android.view.View
import io.github.kakaocup.kakao.pager2.KViewPagerItem
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class LanguageViewItem(matcher: Matcher<View>) : KViewPagerItem<LanguageViewItem>(matcher) {
    val optionLabel = KTextView(matcher){
        withId(R.id.option_label)
    }
}