
var nameGlobal:String?=null

fun showInfo(userID:Int){
    println("userID: $userID")
}

fun showInfo(name : String){
    println(nameGlobal)
    println("Name: $name")
}

fun main(){
    nameGlobal = "Global name"

    showInfo("Avi")
    showInfo(12345)
}
