class dog(val name: String,private val price : Int ){
        val Discount : Int
        get()=price/2


}

fun main() {
    val myDog=dog("German",2000)
    println(myDog.Discount)
}