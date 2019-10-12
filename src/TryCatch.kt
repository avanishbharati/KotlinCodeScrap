import java.util.*

fun main(args:Array<String>){

    var Div = try {
        var n2:Int = readLine()!!.toInt()
        100/n2
    } catch (ex: Exception) {
        println(ex.message)
    }

    println("DIV:$Div")
    println("App is done")
}