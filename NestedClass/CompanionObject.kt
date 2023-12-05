package NestedClass

class Person{
    companion object Test {
        var a = 15
        fun callMe() = println("I'm a function inside of companion object.") // Use when non return type
    }
}
fun main(args:Array<String>){
    Person.callMe()
    println(Person.a)
}