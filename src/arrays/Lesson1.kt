package arrays

fun main(){
//    An array is a collection of similar data types of either Int or String etc
//    Arrays in kotlin are mutable in nature with fixed size which means we can perform
//    both read and write operations on elements of
//    Kotlin array size is fixed after creation


//    implicit declaration of arrays
    var fruits = arrayOf("Banana","Mango","Apple","Oranges")
    var age = arrayOf(12, 10, 46,78)
    var myStuff = arrayOf(12, "Mouse","344.64",true)

//    explicit declaration of arrays
    var counties = arrayOf<String>("Kericho","Mombasa","Nairobi")
    var population = arrayOf<Int>(19403738, 249403949, 34908455)
    var bools = arrayOf<Boolean>(true, false, false, false, true)

//    Accessing elements in an array:
//    1. Use index number
    println(fruits[2])
    println(age[1])

//    2. Use get function
    println(counties.get(0))

//    updating or modifying array values: use set() function
//    set() takes 2 arguments, position and values

    counties.set(1, "Kiambu")
    println(counties[1])

//    size of an array using size function
    val num_counties:Int = counties.size
    println(num_counties)


//    looping through array values using for loop
    for (fruit in fruits){
        println(fruit)
    }

//    looping or traversing
    for (i in 0..num_counties - 1){ //size of array -1 will give you the last index of the array
        println(counties[i])
    }

//    A HashMap is a collection which contains pairs of an object
//    HashMap() is the default constructor which constructs a HashMap instance
//    to create a HashMap you must specify the type of data for keys and values
    var rows : HashMap<String,Int> = HashMap<String,Int>() //empty hashmap
    println(rows)

//    adding item ins the hashmap; use put()
    rows.put("id",1)
    rows.put("kipande",2)
    rows.put("huduma",3)
    rows.put("namba",4)
    rows.put("kitambulisho",5)

    println(rows)
//looping through a hashmap

//    accesing keys in a hashmao
    for (key in rows.keys){
        println(key)
    }
//    accessing values in a hashmap
    for (value in rows.values){
        println(value)
    }
//   accessing key value pairs in a hashmap
    for (item in rows){
        println(item)
    }

    for (key in rows.keys){
        println("$key matches with ${rows[key]}") //wrap Kotlin code inside curly brackets
    }


}