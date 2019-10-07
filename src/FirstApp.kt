
fun main(){
    print("Enter a number")
    val aNumber = readLine()!!.toInt()

    var div2 = aNumber%2

    when(div2){
        0 -> {

            print("Number is even")
        } else -> {

            print("Number is odd")
        }
    }
}