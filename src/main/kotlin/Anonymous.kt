import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    var numLetters = "missipi".count()
    numLetters = "kosa".count({it == 's'})
//========== statrt with first defined Anonymous function
    /*println({
        val currentYear = 2019
        "Welcome to simiVillage, Mayor! (copyright $currentYear )"
    }()*/


    //========== puting it in variable
    /*val greetingFunction: ()->String = {

        val currentYear = 2020
        "welcom mr. --- to this world (copyright $currentYear)"
    }
println(greetingFunction)*/
    // ====================== adding parameter
    //val greetingFunction: (String)-> String= {playerName ->
      //  val currentYear = 2020
      //  "welcome to this world player welcome $playerName!! (copyright $currentYear)"
    //}
    //println(greetingFunction("Rakan"))
//========================================== using the (It) function
    //val greetingFunction: (String)-> String= {
        //val currentYear = 2020
      //  " welcome welcome $it! (copyright $currentYear) " }
    //println("rakan")
    // ====== applyiing it with count from the SL of Kotlin
   // "Mississipi".count { it == 'i' }
    // =========================== Lambda with multible arguments
    /*val greetingFunciton: (String, Int)-> String= { playerName, buildNo->

        val buildNo = Random.nextInt(1..90)
        println("Adding some houses $buildNo")
        "welcome welcome over here $playerName choses building of $buildNo (copyright 2020)"*/
    // ========================= Interface Support
        //val greetingFunction = { playerName:String, buildNo: Int ->

    //println(greetingFunction("Rakan", 2))
//============ funcation with lambda as one of its prameter
    println("===============================")
    //runSimulation("Rakan", greetingFunction)
    // =======================passing Trailing LAmbda
    /*runSimulation("Guyal",) { playerName, buildNo ->
        val currentYear = 2020
        println("adding $buildNo buildings")
        "welcome welcom mr $playerName (copy right $currentYear)"
    }*/
    // rerfrecing a function
        /*runSimulation("Rakan",::cosa){playerName, buildNo ->
        val currentYear = 2020
        println("adding $buildNo houses")
        "welcome welcome dear $playerName! (copyright $currentYear)"
    }*/
    //========================fuction Type as Return Type================================
    runSimulator()

}
// ================== needs more reading for the inline ...
/*inline fun runSimulation(
    playerName: String,
    greatFunction: (String, Int) -> String
){
    val buildNo = Random.nextInt(1..100) // Random selects 1,2 AND 3
    println(greatFunction(playerName,buildNo))
}*/
// using refrence function in the main
/*fun runSimulator(playerName: String, greatFunction: (String, Int)-> String) {
val buildNo = Random.nextInt(1..90) // select random from 1 to 90
    println(greatFunction(playerName, buildNo))
}*/
fun cosa ( buildNo : Int){

    val cost = 200
    println("construciton cost: ${cost* buildNo }")
}
// ================== needs more reading for the inline ...
/*inline fun runSimulation( playerName: String, costPrinter: (Int) -> Unit,
                          greetingFunction: (String, Int) -> String ) {
    val buildNo = Random.nextInt(1..100)  // Randomly select 1..100
    println(greetingFunction(playerName, buildNo)) }*/

//===================== fuction Type as Return Type
fun runSimulator (){
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("rakan"))
}

fun configureGreetingFunction(): (String)-> String {
    val structureType= "hospitals"
    var buildNo = 5
    return {playerName: String->
            val currentYear = 2018
            buildNo += 1
        println("Adding $buildNo $structureType")
        "welcome welcome to Tuwaiq $playerName! (copyright $currentYear)"
    }
}
