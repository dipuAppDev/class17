package NestedClass

class Outer {
    val a = "Outside Nested Class."
    /*Step-1*/
//    class Nested{
//        val b = "Inside Nested Class."
//        fun callMe() = "Function call from inside nested class."
//    }
    /*Step-2*/
    inner class Inner{
        val b = a //when use inner keyword you can access outer class property
        fun callMe() = "Function call from inside nested class."
    }
}