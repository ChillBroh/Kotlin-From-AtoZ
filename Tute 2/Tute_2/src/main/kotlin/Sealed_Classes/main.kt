package Sealed_Classes

fun main(args:Array<String>){
    var circ = getShape();
    when(circ){
        is Shape.Circle ->{
            println(circ)
        }
        is Shape.Square ->{
            println(circ)
        }
        is Shape.Rectangle ->{
            println(circ)
        }
        is Shape.NotAShape ->{
            println(circ)
        }
    }
}