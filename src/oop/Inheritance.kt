package oop
//open class - is a class that can be inherited from
//open-argument means argument can be overridden
//abstract class means it can be inherited from but cannot create an object
//a normal class can create objects but cannot be inherited from


abstract class GeneralPlayer(open val name:String,open var jerseyNumber:Int){
//    init is an object constructor and is executed the moment an object is created
    init {
        println("I am a sportsman")
    }

    fun run(){
        println("I can run fast")
    }

    abstract fun speak()

}

class PingPongPlayer(override val name:String, override var jerseyNumber: Int): GeneralPlayer(name,jerseyNumber){
    override fun speak(){
        println("Hello ping pong fans!!! I am $name")
    }
}

class SoccerPlayer(override val name:String, override var jerseyNumber: Int): GeneralPlayer(name,jerseyNumber){
    override fun speak() {
        println("Hello football fans!!! I am $name")
    }
}

fun main(args: Array<String>) {
    //val p1 = GeneralPlayer("Player 1",23)

    val soccerp = SoccerPlayer("Ronaldo",7)
    val ping = PingPongPlayer("Xi Pi Cheng",4)

    ping.speak()
    soccerp.run()
}