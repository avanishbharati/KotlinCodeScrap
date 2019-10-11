package com.car.maintain

class Car(val type:String, val model:String, val year:Int, val price:Double, val milesDriven:Int, val owner: String) {

    init{
        println("Object class is created")
    }

    fun getResaleValue():Double{
        return this.price - (this.milesDriven.toDouble()*10)
    }
}

fun main(){
    val car = Car("Holden", "Torana",1980,30000.00, 1450, "Avi")

    println(car.type + " " + car.model + " is for sale, the price is $" + car.price + ", Miles driven " + car.milesDriven +", owner is " + car.owner)
    println("The resale value is " + car.getResaleValue())

    val listOfCar:ArrayList<Car> =  arrayListOf<Car>()
    listOfCar.add(car)

    val car2 = Car("Toyota", "Yarris",2018,10000.00, 10, "Avi")

    listOfCar.add(car2)


    for(car in listOfCar){
        println("----------------------------")
        println("Type of car " + car.type)
        println("Resale value of car $" + car.getResaleValue())
    }
}