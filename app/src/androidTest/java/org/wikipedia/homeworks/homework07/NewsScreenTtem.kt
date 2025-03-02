package org.wikipedia.homeworks.homework07

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class NewsScreenTtem(matcher: Matcher<View>) : KRecyclerItem<NewsScreenTtem>(matcher) {
    val title = KTextView(matcher) {
        withId(R.id.view_list_card_item_title)
    }
}