import java.util.Arrays

fun main(args: Array<String>) {
    //for print
    println("Hello World!");
    //function calling
    printAge(10,"Ishara")

    //variables can modified
    var name = "saman";
    name = "Ishara";
    print(name)

    //variables constant
    val name1 = "Ishara";

    //Data Types in Kotlin
    val intvalue = 1; //Integer
    val longValue = 100000;
    val longvalue2 = 1L;
    val byteValue:Byte = 1;
    val doubleval = 1.0;
    val floatValue = 1.2384789f;
    val characherValue = "I";
    val trueValue = true;
    val falseValue = false;
    val StringValue = "String";

    //Arrays
    var clothingBrands = arrayOf("Gucci","Chanel","Adidas","Zara","Puma");

    //size
    println("Size of Array is " + clothingBrands.size)
    println("************")
    //access elements
    println(clothingBrands[3])
    println("************")

    //change element
    clothingBrands[3] = "Ishara"
    println(clothingBrands[3])

    //looping through array
    for(i in clothingBrands){
        println(i)
    }

    //when conditions
    var x =5;
    when (x) {
        0,1 -> println("x == 0 or x==1")
        else -> println("Othrwise")
    }

    //forloops

    for (i in 1 .. 5){
        println(i)
    }

    for(i in 1 until  5){ //print till 5 not including 5
        println(i)
    }

    for(i in 0 ..20 step 5){
        println(i)
    }


    //generics
    fun <T> sort(Items: List<T>){

    }

    //Collections


}

//functions in kotlin
fun printAge(a:Int,b:String){
    println("The age of $b is $a")
}

