import  kotlin.math.sqrt
fun main(){
    println("Cubic Equations are of the form ax3 bx2 cx d=0")

    println("Enter the  value of a:")
    val a:Int= readln().toInt()

    println("Enter the  value of b:")
    val b:Double= readln().toDouble()

    println("Enter the  value of c:")
    val c:Int= readln().toInt()

    println("Enter the  value of d:")
    val d:Int = readln().toInt()

    //transpose the equation to a quadratic
    val answer3=0
    val answer1:Double = (-b+sqrt(b*b- 4*a*c))/2*a
    val answer2:Double = (1-b-sqrt(b*b- 4*a*c))/2*a



    println("The answers are $answer1 , $answer2 and $answer3")


}