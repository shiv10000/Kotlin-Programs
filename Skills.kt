import java.util.*

//Creating a Songs application
 class Song(val title: String,val artist:String,Website_name:String){
     val website=Website_name
     var activity= arrayOf("walks")
     val titleincap : String
         get()= title.uppercase(Locale.getDefault())



     fun play(){
          println(this.website)
         println(this.titleincap)
     }
     fun stop(){
         println("Stop playing this $title")

     }
     init {
         println("Now this object is creting")
     }
     init {
         println("Now its coming in the second step")
     }
 }
 fun main(){
     val songone=Song(,"Manaas","xd")
     songone.play()
     val songTWO=Song("fillal","Rahul","xvideos")
     songTWO.stop()





 }
