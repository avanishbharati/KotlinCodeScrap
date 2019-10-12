package com.car.maintain

class  UserAdmins<T> (credit: T){
    init {
        println(credit)
    }
}

fun <T> display(process:T){
    println(process)
}

fun main(args:Array<String>){

    var userAdmin  = UserAdmins<String>("Avi")
    var userAdmin2 = UserAdmins<Int>(123)
    var userAdmin3 = UserAdmins<Double>(12.34)

    display<Int>(28)
    display<String>("User added...")
}