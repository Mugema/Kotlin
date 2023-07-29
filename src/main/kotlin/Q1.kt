import  kotlin.math.sqrt
fun main(){



    println("Quadratic Equations are of the form ax2 +/- bx +/- c =0")

    println("Enter the corresponding value of a:")
    val a:Int= readln().toInt()

    println("Enter the corresponding value of b:")
    val b:Double= readln().toDouble()

    println("Enter the corresponding value of c:")
    val c:Int= readln().toInt()
    val answer1:Double = (-b+sqrt(b*b- 4*a*c))/2*a
    val answer2:Double = (-b-sqrt(b*b- 4*a*c))/2*a

    println("The answers are $answer1 and $answer2" )


}