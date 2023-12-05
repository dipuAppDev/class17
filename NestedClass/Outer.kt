package NestedClass

class Outer {
    val a = "Outside Nested Class."
    class Nested{
        val b = "Inside Nested Class."
        fun callMe() = "Function call from inside nested class."
    }
}