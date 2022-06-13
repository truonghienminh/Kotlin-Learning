fun main(){
    val age = 25
    val layers = 5
    printCandles(age)
    printCake(age+2)
    printLayers(age+2, layers)
}
fun printCandles(age: Int){
    print()
    repeat(age){
        print(",")
    }
    print()
    repeat(age){
        print("|")
    }
}
fun printCake(age: Int){
    repeat(age){
        print("=")
    }
}
fun printLayers(age: Int, layers: Int){
    repeat(layers){
        repeat(age){
            print("@")
        }
        println()
    }
}