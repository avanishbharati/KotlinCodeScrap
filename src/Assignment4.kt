
fun main(){

    var listOfEvenNumber: String?=""
    for (i :Int in 1..100 step 1){

        var div2 = "$i".toInt() % 2

        if(div2==0) {
            listOfEvenNumber = listOfEvenNumber + "$i" + "\n"
        }
    }

    print(listOfEvenNumber)
}