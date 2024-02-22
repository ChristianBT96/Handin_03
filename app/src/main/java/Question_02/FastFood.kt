package Question_02

interface FastFood {
    var price: Double
    var quantity: Int

    fun printTotalPrice() {
        val totalPrice: Double = price * quantity
        println("The total price is: $totalPrice")
    }

    fun printQuantity() {
        println("The amount ordered: $quantity")
    }

}