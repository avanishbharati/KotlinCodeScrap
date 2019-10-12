package com.car.maintain

import java.applet.AudioClip

interface CreditCardCompany {
    val cardNumber: String
    fun score(age:Int)
}

class MasterCard(override val cardNumber: String):CreditCardCompany{

    override fun score(age: Int) {
        if(age>50 || age < 18){
            println("Discount")
        } else {
            println("Normal")
        }
    }
}

class Visa(override val cardNumber: String) :CreditCardCompany{
    override fun score(age: Int) {
        if(age>50 || age < 15){
            println("Negative")
        } else {
            println("Positive")
        }
    }
}

//delegation
class PayPal(client: CreditCardCompany):CreditCardCompany by client{
    fun print(){
        println(this.cardNumber)
    }
}

fun main(){
    val visa = Visa("1234213123123123")
    visa.score(40)

    val masterCard = MasterCard("345345435435435")
    masterCard.score(10)

    val payPal = PayPal(masterCard)
    println("Card number PayPal : ${payPal.cardNumber}")
    payPal.print()

}

