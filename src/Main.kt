fun main () {
    var girl= Person( "pita", 60, 22)
    girl.eat(2)
    println(girl.weight)
    println(girl.speak( "i am hungry"))
    println(girl.age)

    var data= User( "anna", "maya", "maya@gmail", "072345678", 6655)
     println(data.firstName)
    println(data.lastName)

}
class Person(var name:String,var weight:Int,var age:Int ){
    fun eat (foodWeight:Int) {
        weight+=foodWeight
        println("i am eating $foodWeight kgs of food")
    }


fun speak(speech:String):String {
    return speech

}
fun birth() {
    age++
 }

}
class User (var firstName:String,var lastName:String, email:String, var phoneNumber:String, var password:Int) {


}








