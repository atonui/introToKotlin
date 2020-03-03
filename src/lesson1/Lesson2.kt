package lesson1

fun main(){
//if statements in Kotlin

    val x:Int = 1009

//    if (x < 100){
//        println("X is less than 100")
//    }else{
//        println("X is greater than 100")
//    }

    val result = if (x < 100){
        println("X is less than 100")
    }else{
        println("X is greater than 100")
    }

    println(result)

    val age:Int = 17

    val restrict = if (age <= 18)
        "You are not allowed in"
    else
        "You can party all night long"

    println(restrict)

//    loops in Kotlin
    var y = 0
    while (y < 10){
        println(y)
        ++y
    }

    do{
        println(y)
        y--
    }while (y > 0)

//    in Kotlin, the for loop is used to iterate through ranges, arrays, maps and so on anything that provides an iterator

//    for(item in collection){
//        body of the loop
//    }

    for (i in 0..50){
        if (i%3 == 0 && i%5 == 0){
            println("$i FizzBuzz")
        }else if (i%5 == 0){
            println("$i Buzz")
        }else if (i%3 == 0){
            println("$i Fizz")
        }else
            println(i)
    }

}