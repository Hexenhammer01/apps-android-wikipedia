package org.wikipedia.homeworks.homework07

import android.view.View
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R
import org.wikipedia.feed.dayheader.DayHeaderCardView

class DayHeaderCardView(matcher: Matcher<View>) : KRecyclerItem<DayHeaderCardView>(matcher) {
    val dayHeaderText = KTextView(matcher){
        withId(R.id.day_header_text)
    }
}