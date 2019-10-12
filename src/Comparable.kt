import com.car.maintain.Person
import java.util.*
import kotlin.collections.ArrayList

class Fruit(var name: String, var id: Int):Comparable<Fruit>{

    override fun compareTo(other: Fruit): Int {
        return  this.id - other.id
    }
}

fun main(){

    var listOfFruits = ArrayList<Fruit>();

    listOfFruits.add(Fruit("Apple", 2))
    listOfFruits.add(Fruit("Mango", 5))
    listOfFruits.add(Fruit("Orange", 22))
    listOfFruits.add(Fruit("Banana", 10))


    println("--------Before sort--------")

    for(fruit in listOfFruits){
        println("Name :" + fruit.name)
        println("ID :" + fruit.id)
    }

    println("--------After sort--------")
    Collections.sort(listOfFruits)

    for (fruit in listOfFruits){
        println("Name:" + fruit.name)
        println("ID :" + fruit.id)
    }

}