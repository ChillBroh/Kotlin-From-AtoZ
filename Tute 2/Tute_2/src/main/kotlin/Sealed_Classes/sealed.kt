package Sealed_Classes
//cannot inherit outside this file. only within this file
sealed class Shape{
    class Circle(var radius: Int):Shape()
    class Square(var length:Int):Shape()
    class Rectangle(var length:Int, var width:Int):Shape()
    object NotAShape:Shape()
}

fun getShape():Shape{
    return Shape.Circle((10..100).random())
}