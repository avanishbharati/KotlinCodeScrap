
val sum = {a:Int, b:Int ->
    a + b
}

fun main() {
    val addNumbers = sum(10,23)
    println(addNumbers)

    val listOfNum: List<Int> = listOf(10,22,34,55)

    //normal loop
    for(number in listOfNum){
        println(number)
    }

    //lamda
    println("Lamda for loop")
    listOfNum.forEach{number ->
        println(number)
    }
}