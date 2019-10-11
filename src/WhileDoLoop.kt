
fun main(){

    for (i:Int in 1..100 step 2){
        println("Counter $i")
    }

    println("While Loop")

    var i=1
    while (i<=10){

        println("Counter $i")
        i += 2
    }

    println("Do While Loop")

    i= 1
    do{
        println("Counter $i")
        i +=2
    } while (i<=10)

}