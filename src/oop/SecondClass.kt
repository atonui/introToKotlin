package oop

class Player(wealth:Long, goat:Boolean, club:String){
    var mali: Long
    var mbuzi: Boolean
    var klabu: String

    init {
//        used to assign values to variable
//        this code will be called as soon as the object is created
        this.mali = wealth
        this.mbuzi = goat
        this.klabu = club
    }
    var gender: String = "male"
    var colour: String = "black"

    fun printDetails(){
        println("This player is worth ${this.mali}")
        println(this.mbuzi)
        println("He plays for ${this.klabu}")
    }

}

fun main() {
    val p1 = Player(2_000_000,false,"Aston Villa")
    val p2 = Player(20_000_000_000,true,"MANU")
    val p3 = Player(50_000_000_000,true,"Liverpool")

p1.printDetails()
}