package oop

//    to create a class use the keyword class followed by the name of the class starting with a CAPITAL letter
//    the class name is followed by curly brackets
    class Car{
//properties/fields are variables
        var wheels:Int = 4
        var bonnet:String = "long"
        var size:String = "big"
        var make:String = "Mercedes Benz"
        var door:Int = 4
        var colour:String = "Yellow"
        var automatic:Boolean = false

        fun greetings(){
            println("Hello World")
        }
//method that takes an argument
        fun speed(mbio:Int){
            println("This car moves at $mbio kph")
        }

//    method that returns a variable
        fun yom(year:Int):Int{
            return year
}
        }

fun main(args: Array<String>) {
//    an object is an instance of a class
//    to crate an object declare a val or var followed by the object then assign to the blueprint/class
    val car1 = Car()

//    car1 is an object while Car is the class from which car1 is created/ instantiated
//    when you create an object from a class, it inherits all the feature of the class
//    to access class properties and methods use the dot(.) operator
    println(car1.wheels)
    println(car1.automatic)
    car1.greetings()
    car1.speed(200)
    println(car1.yom(1995))

//    assign to a a variable and use it later
    val year0:Int = car1.yom(1987)

    println(year0 + 100)





}
