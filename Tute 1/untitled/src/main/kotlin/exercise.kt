fun circumference(Radius: Float):Float{
    return 2 * 3.14f * Radius;
}

fun calcGrade(mark : Int):Char{
    if(mark in 100..75){
        return 'A';
    }else if (mark in 65..74) {
        return 'B';
    }else if(mark in 50..64){
        return 'C'
    }else if(mark in 35..49){
        return 'D'
    }
    else{
        return 'F'
    }
}

fun primeDetect(num : Int):Boolean{
    if(num  == 1  )
        return false;
    else{
        var count = 0;
        for(i in 1..num){

            if(num % i == 0){
                count++;
            }
        }
        return count <=2
    }
}

fun main(){
    //circumference of a circle
    val r = 7.0f;
    val result = circumference(r);
    println("Circumference is $result")

    //marks
    val marks = 58;
    println("Your Grade is " + calcGrade(marks))

    //prime number
    val res = primeDetect(5);
    if(res)
        println("Prime number")
    else print("Not a prime")
}