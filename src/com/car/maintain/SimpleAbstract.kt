package com.car.maintain

abstract class CreditCard(){
    fun UserID(): String {
        return "34234234234234"
    }

    abstract fun newUserID()
}

class UserInfo():CreditCard(){

    fun getInfo():String{
        return UserID()
    }

    override fun newUserID() {
        println("New user created")
    }
}

fun main(args:Array<String>){

    var user = UserInfo()
    println(user.getInfo())
    user.newUserID()
}