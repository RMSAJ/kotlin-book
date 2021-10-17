import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    var patianteAge= readLine()!!.toInt()

    val vaccineFunctionUrgent: (Int) -> Boolean= { age ->

        when (age) {
            in 65..999 -> true
            else -> false
        }
    }
        val greetFunction = {playerName: String, numBuilding: Int->
            val currentYear = "2019"
            println("adding $numBuilding houses")
            "welcom to simVillage, $playerName! (copright $currentYear)"
        }

        runSimulation("Aymen",greetFunction )



    val isUrgent: (Int,String)-> String={age, name->

         val spec= when (age){

            in 65..900 -> "take the dose "
            else -> "go away"
        }
        " $name $spec "

        }

    println(vaccineFunctionUrgent(70))
        println("Pationte age")
    println(isUrgent(patianteAge,"Aymen"))

    }
fun runSimulation (playerName: String, greetingFun: (String, Int)-> String) {
    // random selection
    val numBuildings = Random.nextInt(1..100)
    println(greetingFun(playerName, numBuildings))
}

