package oop

class Calculator(num1:Int, num2:Int){
    var num1:Int
    var num2:Int
    init {
        this.num1 = num1
        this.num2 = num2
    }

    fun add(){
        println("Addition of $num1 and $num2 is: ${num1 + num2}")
    }
    fun subtract(){
        println("Difference of $num1 and $num2 is: ${num1 - num2}")
    }
    fun multiply(){
        println("Multiplication of $num1 and $num2 is: ${num1 * num2}")
    }
    fun modulo(){
        println("Modulus of $num1 and $num2 is: ${num1 % num2}")
    }
}

fun main(args: Array<String>) {
    val firstnum = Calculator(2,4)
    firstnum.add()
    firstnum.subtract()
    firstnum.modulo()
    firstnum.multiply()

}