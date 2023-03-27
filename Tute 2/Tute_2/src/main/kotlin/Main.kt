fun main(args: Array<String>){
    //create a class
    val b1 = Bird();
    //access properties
    b1.color = "Green";
    b1.type = "Parrot";

    println(b1.type)
    println(b1.color)

    //create object from child
    val c1 = Parrot();
    c1.color;
}