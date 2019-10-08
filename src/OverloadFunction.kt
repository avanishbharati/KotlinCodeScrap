
fun add(a:Int, b:Int):Int{
    return a + b
}

fun add(a:Int, b:Int, c:Int):Int{
    return a + b + c
}

fun add(a:Int, b:Int, c:Int, d:Int):Int{
    return a + b + c + d
}

fun add(a:Int, b:Int, c:Int, d:Int, e:Int):Int{
    return a + b + c + d + e
}

fun main(){
    println(add(2,3))
    println(add(2,5,6))
    println(add(2,5,6, 7))
    println(add(2,5,6, 7,1))
}