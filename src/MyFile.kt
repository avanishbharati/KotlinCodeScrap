import java.io.FileReader
import java.io.FileWriter

fun main(args:Array<String>){
    println("1 - Read\n 2 - Write")

    val op= readLine()!!.toInt()

    when(op){
        1 -> {ReadFromFile()}
        2 ->{
            print("Enter text to write to file:")
            var str:String = readLine().toString()
            WriteToFile(str)
        }
    }
}

fun WriteToFile(str: String){

    try {
        val fo=FileWriter("test.txt",true)
        fo.write(str)
        fo.close()
    } catch (ex: Exception) {
        println(ex.message)
    }
}

fun ReadFromFile(){

    val fin=FileReader("test.txt")
    var c:Int?

    do{
        c=fin.read()
        print(c.toChar())
    } while (c!=-1)
}