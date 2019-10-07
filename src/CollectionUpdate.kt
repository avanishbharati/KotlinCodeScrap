

fun main(){

    //immutable
    var listImmutable:List<String> = listOf("Apple","Pears")
    for(name:String in listImmutable){
        println(name)
    }

    //mutable
    var listMutable:MutableList<String> = mutableListOf("Apple", "Pears")
    listMutable[0] = "Orange"
    for(name:String in listMutable){
        println(name)
    }

    var listOfFruitsI =  mapOf(1 to "Lemons", 2 to "Pears")

    println(listOfFruitsI.get(1))

    var listOfFruitsIM = mutableListOf(1 to "Apple", 2 to "Pears")

    println(listOfFruitsIM.get(0))

    listOfFruitsIM.set(0, 1 to "Strawberry")

    println(listOfFruitsIM.get(0))

}

