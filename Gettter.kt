class dog(val name: String,price : Int ){
        var price=price
            set(value){
                if(value>500)field=value
                else field=1000
            }

        val Discount : Int
        get()=price/2




}

fun main() {
    val myDog=dog("German",2000)
    println(myDog.Discount)
    myDog.price=52
    println(myDog.Discount)

}
