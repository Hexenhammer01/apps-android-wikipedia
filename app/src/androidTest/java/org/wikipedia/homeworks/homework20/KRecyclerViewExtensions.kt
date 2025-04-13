package org.wikipedia.homeworks.homework20

import androidx.room.Index
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView

inline fun <reified T : KRecyclerItem<*>> KRecyclerView.invokeAtIndex(
    index: Int,
    function: T.() -> Unit
) {
    val res = this
    childAt<T>(index) {
        setName(res.getName().withParent("$index"))
        function()
    }
}