package lesson1

fun main() {
    print("Hello? ")
    println("How are you?")
    println("I was wondering if after all these years you'd like to meet?")

    //Variables in Kotlin
//    you can declare variables in Kotlin using the val and var keywords
    //Immutable variable i.e cannot change
//    implicit type inference
    val name = "John Doe" //val cannot be changed later i.e is constant
    var language = "Kotlin"

    println(name)
    println(language)

//    reassign a variable
    language = "PHP"

    println(language)

//    explicit type inference
    val age:Int = 23
    val country:String = "Kenya"

    println(age)
    println(country)

    //age = 56 this won't work since age is an immutable variable

    println("My name is "+name+" and I am from " + country)

    println("I come from $country and I am $age years old.")
    println("I come from $country and I am ${age + 10} years old.")

    println(100*100)


    //    Data types in Kotlin
//    1. byte 8 bits
//    2. short 16 bits
//    3. int 32 bits
//    4. long 64 bits
//    5. float 32 bits
//    6. double 64 bits
//    7. boolean
//    8. strings

    val myByte:Byte = 10
    val myShort:Short = 150
    val myInt:Int = 245
    val myLong:Long = 2300000000000012948L
    val myFLoat:Float = 12.452345f
    val myDouble:Double = 1231233.2341253
    val isLoggedin:Boolean = true
    val jina:String = "John Doe"

    println(jina.length)

    println(jina[0])
    println(jina.first())

//    Type convertion
    println(myByte.toInt())
    println(myShort.toString())




}