package Interface

class Mango : Fruit {
    override var text: String = "Sweet"
    override var color: String = "Black"
    override fun size() {
        println("This is Mango Size.")
    }
    override fun tree() {
        //super.tree()
        println("This is green big tree.")
    }
}