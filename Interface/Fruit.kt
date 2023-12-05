package Interface

interface Fruit {
    var text:String // No initialization only declaration
    var color:String
    fun size() // No initialization only declaration
    fun tree(){ // you can initialization fun body in a interface
        println("This is big")
    }
}