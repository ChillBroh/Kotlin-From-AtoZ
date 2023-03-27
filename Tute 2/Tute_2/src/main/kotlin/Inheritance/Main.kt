fun main(args: Array<String>){
    //create a class
    val b1 = Bird("Parrot","Red");
    //access properties
    b1.type = "Parrot";
    b1.color = "Green";


    println(b1.type)
    println(b1.color)

    //create object from child
    val c1 = Box();
    c1.myFunction();


}