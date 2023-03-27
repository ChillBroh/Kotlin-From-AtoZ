
class Box constructor(
    val length: Int = 10,
    val width: Int = 20,
    val height: Int = 5
){
    /*properties
    val length: Int = 10
    val width: Int = 20
    val height: Int = 5
    */
    init {
        println("Init block called");
    }
    //behaviours
    fun fillContents(){
        print("Box is filled")
    }

    fun open(){
        print("Box is Open")
    }

}