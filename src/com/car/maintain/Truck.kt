package com.car.maintain

//Inheritance
class Truck:CarConstructor{

    var subType:String?=null

    constructor(type:String, model:String, year:Int, price:Double, milesDriven:Int, owner: String, subType: String):

    super(type, model, year, price, milesDriven, owner){

        this.subType = subType
    }

    constructor(type:String, model:String, year:Int, price:Double, milesDriven:Int, subType: String):

            super(type, model, year, price, milesDriven){

        this.subType = subType
    }

    override fun getResaleValue():Double{
        return this.getPrice()!! - (this.milesDriven!!.toDouble()*5)
    }
}

fun main(){
    val car = Truck("Holden", "Torana",1980,30000.00, 1450, "Avi", "Ute")

    println(car.type + " " + car.model + " is for sale, the price is $" + car.getPrice() + ", Miles driven " + car.milesDriven +", owner is " + car.owner)
    println("Type is " + car.subType)
    println("The resale value is " + car.getResaleValue())

    val listOfCar:ArrayList<Truck> =  arrayListOf<Truck>()
    listOfCar.add(car)

    val car2 = Truck("Toyota", "Yarris",2018,10000.00, 10, "Hertz rental")

    listOfCar.add(car2)

    for(car in listOfCar){
        println("----------------------------")
        println("Type of car " + car.type)
        println("Sub Type is " + car.subType)
        println("Resale value of car $" + car.getResaleValue())
    }
}