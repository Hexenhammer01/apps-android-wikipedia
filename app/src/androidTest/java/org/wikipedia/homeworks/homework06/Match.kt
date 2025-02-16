package org.wikipedia.homeworks.homework06

import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher

enum class Colors { RED, BLUE, GREEN, YELLOW, BLACK, WHITE }

data class Shape(val sideLength: Float, val sides: Int, val color: Color)

class ColorM(private val expectedColors: Colors) : TypeSafeMatcher<Shape>() {
    override fun describeTo(description: Description) {
        description.appendText("имеет цвет  $expectedColors")
    }
    override fun matchesSafely(item: Shape): Boolean {
        return item.color == expectedColors
    }
}
