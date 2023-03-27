//test class
class Bird constructor(
    var type : String,
    var color: String
    ) {
}

//super must open to inherit
 open class Shape{
     var color = "Green"
 }
class Box:Shape(){
    fun myFunction(){
        println(color)
    }
}