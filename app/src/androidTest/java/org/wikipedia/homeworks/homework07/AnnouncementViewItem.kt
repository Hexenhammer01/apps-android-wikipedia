package org.wikipedia.homeworks.homework07


import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class AnnouncementViewItem(matcher: Matcher<View>) : KRecyclerItem<AnnouncementViewItem>(matcher){
    val annoncementImage = KImageView(matcher){
        withId(R.id.view_announcement_header_image)
    }
    val announcemenText = KTextView(matcher){
        withId(R.id.view_announcement_text)
        withText(R.string.feed_configure_onboarding_text)
    }
    val announcementActionPositive = KButton(matcher){
        withId(R.id.view_announcement_action_positive)
    }
    val announcementActionNegative = KButton(matcher){
        withId(R.id.view_announcement_action_negative)
    }
}