
fun sumOfNumbers( x: Double, y : Double ){
    val temp : Double = x + y
    println(temp)
}

//return
fun addNumbers( x: Double, y : Double ): Double{
    val temp : Double = x + y
    return temp
}

//with initial value
fun addNum( x: Double = 0.0, y : Double = 0.0 ): Double{
    val temp : Double = x + y
    return temp
}

fun displayFruits(vararg names:String){

    for (name:String in names){
        println(name)
    }
}

fun main(){
    sumOfNumbers(5.9, 0.1)
    sumOfNumbers(1.9, 0.2)
    sumOfNumbers(2.9, 0.3)

    var sumOfNum : Double = addNumbers(4.1,3.1)
    println("Sum is $sumOfNum")

    var sum = addNum(5.0)
    println("Sum is $sum")

    sum = addNum(y=11.0)
    println("Sum is $sum")

    displayFruits(names = *arrayOf("Apple","Pears","Orange"))

}