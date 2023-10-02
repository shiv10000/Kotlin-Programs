open class Animal(val mood: String){
   open val image=""
    open vars food=""
    open val habitat=""
    open val hunger=""
    open fun makeNoise(){
        println("The am=nimal is mamkiing noise")
    }
    open fun eat(){
        println("The animal is eating")
    }
    open fun roam(){
        println("The animal is roaming")


    }
    open fun sleep(){
          println("")
      }

}
class Hippo(MAKEMOOD : String) : Animal(MAKEMOOD){

}

fun main() {
    val Myhippo=Hippo("GOOd")
    println(Myhippo.mood)
    Myhippo.food="Grass"
    println(Myhippo.food)

}
