package org.wikipedia.homeworks.homework06

import org.hamcrest.Description
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher

val shapes = listOf(
    Shape(10f, 3, Color.RED), Shape(5f, 4, Color.BLUE), Shape(7f, 2, Color.GREEN),
    Shape(0.5f, 1, Color.YELLOW), Shape(-3f, 5, Color.BLACK), Shape(8f, -2, Color.WHITE),
    Shape(12f, 6, Color.RED), Shape(15f, 8, Color.BLUE), Shape(20f, 4, Color.GREEN),
    Shape(9f, 5, Color.YELLOW), Shape(2f, 3, Color.BLACK), Shape(11f, 7, Color.WHITE),
    Shape(6f, 10, Color.RED), Shape(3f, 2, Color.BLUE), Shape(4f, 1, Color.GREEN),
    Shape(25f, 12, Color.YELLOW), Shape(30f, 14, Color.BLACK), Shape(35f, 16, Color.WHITE),
    Shape(40f, 18, Color.RED), Shape(50f, 20, Color.BLUE)
)


class ColorM(private val expectedColors: Color) : TypeSafeMatcher<Shape>() {
    override fun describeTo(description: Description) {
        description.appendText("имеет цвет  $expectedColors")
    }
    override fun matchesSafely(item: Shape): Boolean {
        return item.color == expectedColors
    }
}


class DlinnaMatcher(val min: Float, val max: Float) : TypeSafeMatcher<Shape>() {
    override fun describeTo(description: Description) {
        description.appendText("диапозон от $min до $max")
    }
    override fun matchesSafely(item: Shape): Boolean {
        return item.sideLength in min..max
    }
}

class OtrizatelnayaStoronaMatcher : TypeSafeMatcher<Shape>() {
    override fun describeTo(description: Description) {
        description.appendText("есть отрицательная сторона ")
    }
    override fun matchesSafely(item: Shape): Boolean {
        return item.sideLength >= 0
    }
}

class OtrizatelnoeKovichestvoStoronMatcher : TypeSafeMatcher<Shape>() {
    override fun describeTo(description: Description) {
        description.appendText("отрицательное количество сторон")
    }
    override fun matchesSafely(item: Shape): Boolean {
        return item.sides >= 0
    }
}

fun isColor (expectedColors: Color) = ColorM(expectedColors)
fun isDlinna(min: Float, max: Float) = DlinnaMatcher(min, max)
fun isOtrizatelnoeKovichestvoStoronMatcher() = OtrizatelnoeKovichestvoStoronMatcher()
fun isOtrizatelnayaStoronaMatcher() = OtrizatelnayaStoronaMatcher()


val filteredShapes = shapes.filter { shape ->
    allOf(
        isDlinna(
            min = 1f,
            max =1110f
        ),
        isOtrizatelnoeKovichestvoStoronMatcher(),
        isOtrizatelnayaStoronaMatcher(),
        isColor(Color.RED)
    ).matches(shape)
}


fun main (){
    println("$filteredShapes")
}

