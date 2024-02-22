package Question_02

import Question_01.Sizes

class Pizza(
    override var price: Double,
    override var quantity: Int,
    var size: Sizes ): FastFood
{
    fun printPizzaSize() {
        println("The size of the pizza is: $size")
    }
}