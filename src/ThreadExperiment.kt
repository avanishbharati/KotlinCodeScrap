import java.lang.Exception

fun main(args:Array<String>){
    var t1 = thread("Thread1")
    t1.start()

    var t2 = thread("Thread2")
    t2.start()

    var t3 = thread("Thread3")
    t3.start()

    t3.join() //wait for other threads to complete
    println("Thread call is over")

}

class thread():Thread(){

    var ThreadName:String=""

    constructor(ThreadName:String):this(){
        this.ThreadName=ThreadName
        println("${this.ThreadName} has started")
    }
    override  fun run(){
        var count=0

        while (count < 10){
            println("${this.ThreadName} Count:$count")
            count++

            try {
                Thread.sleep(1000)
            }catch ( ex:Exception){
                print(ex.message)
            }
        }
    }
}