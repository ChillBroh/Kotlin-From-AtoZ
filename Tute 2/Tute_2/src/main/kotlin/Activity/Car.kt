package Activity

class Car(
    var brand : String,
    var model : String,
    var year : String
){
    fun showDetails(){
        println(brand)
        println(model)
        println(year)
    }
}