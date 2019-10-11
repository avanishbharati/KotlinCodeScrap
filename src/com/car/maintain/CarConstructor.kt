package com.car.maintain

open class CarConstructor(){

    var type  : String?=null
    var model : String?=null
    var year  : Int?=null
    private var price : Double?=null
    var milesDriven : Int?=null
    var owner       : String?=null

    constructor(type:String, model:String, year:Int, price:Double, milesDriven:Int, owner: String):this(){
        this.type = type
        this.model = model
        this.year = year
        this.price = price
        this.milesDriven = milesDriven
        this.owner = owner
    }

    constructor(type:String, model:String, year:Int, price:Double, milesDriven:Int):this(){
        this.type = type
        this.model = model
        this.year = year
        this.price = price
        this.milesDriven = milesDriven
    }


    open fun getResaleValue():Double{
        return this.price!! - (this.milesDriven!!.toDouble()*10)
    }

    fun getPrice():Double{
        return this.price!!
    }

}

fun main(){
    val car = CarConstructor("Holden", "Torana",1980,30000.00, 1450, "Avi")

    println(car.type + " " + car.model + " is for sale, the price is $" + car.getPrice() + ", Miles driven " + car.milesDriven +", owner is " + car.owner)
    println("The resale value is " + car.getResaleValue())

    val listOfCar:ArrayList<CarConstructor> =  arrayListOf<CarConstructor>()
    listOfCar.add(car)

    val car2 = CarConstructor("Toyota", "Yarris",2018,10000.00, 10)

    listOfCar.add(car2)

    for(car in listOfCar){
        println("----------------------------")
        println("Type of car " + car.type)
        println("Resale value of car $" + car.getResaleValue())
    }
}