import java.io.File
import kotlin.text.split
// read the string Chapter, Set Chapter
// read the slide on slack about assignment
fun main() {
    val studentList = mutableListOf("Tom", "Tim", "Tem", "TemTom")

    //1
    studentList.addAll(0, listOf("Zamel", "Saudun"))
    println(studentList)
    //2
    studentList.add(2, "Rakan")
    //3&  4
    for (item in 0 until studentList.size - 5) {

        studentList[item] = "Eng ${studentList[item]} "
    }
    println(studentList)
    // remove any eng
    studentList.removeIf { it.contains("Eng") }
    println(studentList)
    // making all students AT
    for (index in 0 until studentList.size) {

        studentList[index] = "Student ${studentList[index]} "
    }
    println(studentList)


    // read from file
    // var listFromFile = File(pathname: "data/students.txt ").readText().sp
    var listFromFile = File("data/students.txt").readText().split("\n")
     var kosa = listFromFile.toMutableList()
    println(kosa)
   listFromFile.forEach{

       println(it)}

}
/// list of students mim students list
    // add zamel, Saudon as single student -> as first index
    // add myself
    //edit from zamel to Eng. Zamel
    // saudun to Eng. sadun
    // remove any eng
    // scan the list and make all student ST.(the thier name)