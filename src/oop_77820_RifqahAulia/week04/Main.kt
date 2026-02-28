package oop_77820_RifqahAulia.week04


fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 80)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager(name = "Budi", baseSalary = 10_000_000)
    manager.work()
    println("Bonus ${manager.name}: ${manager.calculateBonus()}")

    val developer = Developer(name = "Ani", baseSalary = 8_000_000, programmingLanguage = "Kotlin")
    developer.work()
    println("Bonus ${developer.name}: ${developer.calculateBonus()}")
}