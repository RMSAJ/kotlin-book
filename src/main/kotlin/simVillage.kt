fun main() {
    /*println({
        val currentYear = 2018
        " Welcome to SimVillage, Mayor! (copyright $currentYear) "
    }()
    )*/

   /* val greetingFunction: () -> String = {
        val currentYear = 2018
        "welcome to SimVillage, Mayor!  (Copy Right $currentYear)"

    }*/
    val greetingFunction: (String) -> String = { playerName ->
    val currentYear = 2018
        "welcome SimiVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunction("Guyal"))

}