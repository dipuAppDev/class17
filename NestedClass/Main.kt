package NestedClass

fun main(args: Array<String>) {
    val outer = Outer()
    println(outer.a)
    val nested = outer.Inner()
    println(nested.b)
    println(nested.callMe())
}