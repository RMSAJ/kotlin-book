
fun main() {
val name = "Madrigal"
val healthPoints = 89
val isBlessed = true
val isImmortal = false

   /* val healthStatus: String = if (healthPoints == 100) " in good health condition"
    else if(healthPoints>= 90) " has few scraches"
    else if( healthPoints>= 75) {
        if (isBlessed) " has minor injuries"
        else " has minor injuries" }
    else if(healthPoints >= 50)" is dying!!"
    else " ahhhhhh"*/
    //=======================================
    // Aura

    // player status
    // ranges
    /*val healthStatus: String = if (healthPoints ==100) " in good health condition"
    else if(healthPoints in 90 ..99) " has few scraches"
    else if( healthPoints in 75 .. 89) {
        if (isBlessed) " has minor injuries"
        else " has minor injuries" }
    else if(healthPoints in 50 ..74)" need healing"
    else "dead"*/
    // health status with "when"================
  val healthStatus =  newFunction(healthPoints, isBlessed)
  val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
  printPlayerStatus(auraColor= "none",
                    isBlessed= true,
                    name = "Madigard",
                    healthStatus = "states")
       // casting Fire Ball
castFireBall(5)



}

private fun castFireBall(numFireBall : Int = 2){

    println(" super fire ball !!! (x$numFireBall)")
}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println(" Aura: ${auraColor}" + " (Blessed: ${if (isBlessed) "YES" else "no"})")
    println("$name $healthStatus")
}

private fun auraColor(
    isBlessed: Boolean,
    healthPoints: Int,
    isImmortal: Boolean
    ): String {
    val auraVisible = isBlessed && healthPoints >= 50 || isImmortal
    val auraColor = if (auraVisible) "green"
    else "none"
    return auraColor
}

private fun newFunction(healthPoints: Int, isBlessed: Boolean): String {
    val healthStatus: String = when (healthPoints) {
        100 -> "in good health condition"
        in 90..99 -> "minor damage"
        in 75..89 -> if (isBlessed) {
            "has minor injuries with quick healing"
        } else {
            "minor injuries"
        }
        in 15..74 -> "needs healing "
        else -> "the ducker is dying"
    }
    return healthStatus
}

/*private fun newFunction(healthPoints: Int, isBlessed: Boolean): String =
     when (healthPoints) {
        100 -> "in good health condition"
        in 90..99 -> "minor damage"
        in 75..89 -> if (isBlessed) {
            "has minor injuries with quick healing"
        } else {
            "minor injuries"
        }
        in 15..74 -> "needs healing "
        else -> "the ducker is dying"
    }*/










