package com.car.maintain

enum class Direction{
    NORTH, SOUTH, EAST, WEST
}

fun main(args:Array<String>){

    var userDirection = Direction.SOUTH

    if(userDirection == Direction.EAST){
        println("He went East")
    } else {
        println("I dont know")
    }
}