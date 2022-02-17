
fun main(){
    val factory: VehicleFactory = MotorVehicle.Factory
    val motorVehicle = factory.buildVehicle()
    motorVehicle.production()

    val factory2: VehicleFactory = NonMotorVehicle.Factory
    val nonMotorVehicle = factory2.buildVehicle()
    nonMotorVehicle.production()

}

interface Vehicle {

    fun production()
}

abstract class VehicleFactory {

    abstract fun buildVehicle(): Vehicle
}

class MotorVehicle : Vehicle {

    companion object Factory : VehicleFactory() {
        override fun buildVehicle() = MotorVehicle()
    }

    override fun production() {
        println("Car")
    }
}

class NonMotorVehicle : Vehicle {

    companion object Factory : VehicleFactory() {
        override fun buildVehicle() = NonMotorVehicle()
    }

    override fun production() {
        println("Bike")
    }
}