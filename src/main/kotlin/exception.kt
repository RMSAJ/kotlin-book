fun main() {

    try { val anyNum = 249/0 } //  any number/0 will defiently result in ArithmeticException as indicated by the
    catch (e: ArithmeticException){                                                             // compiler
        println(e) }
    println(" the error has been handled and the program keeps running")
}