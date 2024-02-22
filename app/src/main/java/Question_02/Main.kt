package Question_02

import Question_01.Sizes

// Create an interface called FastFood (with appropriate methods) and create a Sandwich class,
// a Pizza class and a class you decide that implements the FastFood interface.

fun main() {
    val sandwich1: Sandwich = Sandwich(75.0, 3)
    val sandwich2: Sandwich = Sandwich(55.0, 5)
    val pizza1: Pizza = Pizza(80.0, 2, Sizes.MEDIUM)
    val pizza2: Pizza = Pizza(110.0, 1, Sizes.LARGE)

    val listOfFastFoodItems: List<FastFood> = listOf(sandwich1, sandwich2, pizza1, pizza2)

    listOfFastFoodItems.forEach {
        if (it is Pizza) {
            it.printPizzaSize()
            it.printTotalPrice()
            println()
        } else if (it is Sandwich) {
            it.printQuantity()
            it.printTotalPrice()
            println()
        }
    }
}

