package Question_03

// Create a class that implements the following interface.

// internal interface Vehicle {
//  fun changeGear(a: Int)
//  fun speedUp(a: Int)
//  fun applyBrakes(a: Int)
// }
// Now create two objects using the class created.

fun main() {
    val car1: Car = Car(1, 0, false)
    car1.changeGear(2)
    println(car1.gear)
    car1.speedUp(20)
    println(car1.speed)
    // In the initialization of the car, the brakes are set to false.
    // When the brakes are applied, the value of the brakes is set to true using an integer, in this case 0.
    car1.applyBrakes(0)
    println(car1.brakes)
    val car2: Car = Car(2, 30, false)
}
