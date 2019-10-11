package com.car.maintain

//extension of ArrayList
fun ArrayList<Int>.findMax():Int{
    var maxNumber = 0
    for(item:Int in this){
        if(item>maxNumber){
            maxNumber = item
        }
    }

    return maxNumber
}
fun main(){

    val listOfElements = ArrayList<Int>()
    listOfElements.add(9)
    listOfElements.add(44)
    listOfElements.add(5)
    listOfElements.add(15)
    listOfElements.add(6)
    listOfElements.add(12)

    for(item:Int in listOfElements){
        println(item)
    }

    println("Max is ${listOfElements.findMax()}" )
}