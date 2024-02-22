package Question_03

class Car(gear: Int, speed: Int, brakes: Boolean): Vehicle {
    var gear: Int = gear
    var speed: Int = speed
    var brakes: Boolean = brakes
    override fun changeGear(a: Int) {
        gear = a
    }

    override fun speedUp(a: Int) {
    speed = a
    }

    override fun applyBrakes(a: Int) {
    brakes = true
    }

}