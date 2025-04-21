package org.wikipedia.homeworks.homework22

import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView

inline fun <reified T: KRecyclerItem<*>> KRecyclerView.invokeByID(
    index : Int,
    targetId : Int,
    function: T.() -> Unit
){
    val recycler = this
    find
    for (i in 0 until getSize()){
        childAt<T>(i){
            Log.d("KASPRESSO", "Iteration $i: findBlockCounter = $findBlockCounter")
            if (predicate()) {
                if (findBlockCounter == targetIndex) {
                    name(recycler.name().withParent("$targetIndex's block of $blockName"))
                    function()
                    Log.d(
                        "KASPRESSO",
                        "Target block found at index $i (targetIndex = $targetIndex)"
                    )
                    return
                }
                findBlockCounter++
                Log.d(
                    "KASPRESSO",
                    "Matched item at index $i, updated findBlockCounter = $findBlockCounter"
                )
            }
        }
    }
    throw NotFoundException("Not found block with $targetIndex index of $blockName")
}

inline fun <reified T : KRecyclerItem<*>> KRecyclerView.findByPredicate(
    targetIndex: Int,
    blockName: String,
    limiter: Int,
    predicate: T.() -> Boolean,
): T {
    val recycler = this
    var findBlockCounter = 0
    val max = min(limiter, getSize())
    Log.d("KASPRESSO", "max = $max: limiter = $limiter and size is ${getSize()}")
    for (i in 0 until max) {
        childAt<T>(i) {
            Log.d("KASPRESSO", "Iteration $i: findBlockCounter = $findBlockCounter")
            if (predicate()) {
                Log.d(
                    "KASPRESSO",
                    "Matched item at index $i, updated findBlockCounter = $findBlockCounter"
                )
                if (findBlockCounter == targetIndex) {
                    Log.d(
                        "KASPRESSO",
                        "Target block found at index $i (targetIndex = $targetIndex)"
                    )
                    name(recycler.name().withParent("$targetIndex's block of $blockName"))
                    return this
                }
                findBlockCounter++
            }
        }
    }
    throw NotFoundException("Not found block with $targetIndex index of $blockName")
}

inline fun <reified T : KRecyclerItem<*>> KRecyclerView.invokeByID(
    targetIndex: Int,
    targetID: Int,
    blockName: String,
    limiter: Int,
    function: T.() -> Unit
) = invokeByPredicate(targetIndex, blockName, limiter, { hasIdAction(targetID) }, function)

inline fun <reified T : KRecyclerItem<*>> KRecyclerView.invokeByClass(
    targetIndex: Int,
    targetClass: Class<out View>,
    blockName: String,
    limiter: Int,
    function: T.() -> Unit
) = invokeByPredicate(targetIndex, blockName, limiter, { hasClassAction(targetClass) }, function)

inline fun <reified T : KRecyclerItem<*>> KRecyclerView.findByID(
    targetIndex: Int,
    targetID: Int,
    limiter: Int,
    blockName: String
): T = findByPredicate(targetIndex, blockName, limiter) { hasIdAction(targetID) }

inline fun <reified T : KRecyclerItem<*>> KRecyclerView.findByClass(
    targetIndex: Int,
    targetClass: Class<out View>,
    limiter: Int,
    blockName: String
): T = findByPredicate(targetIndex, blockName, limiter) { hasClassAction(targetClass) }