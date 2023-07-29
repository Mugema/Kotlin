fun main(){
    println("Enter the first number:")
    val no1= readln().toDouble()
    println("Enter the Second number")
    val no2= readln().toDouble()
    println("Enter a math Symbol(*+/-):")
    val symbol= readln()

    val answer=calculator(no1,no2,symbol)
    if (answer==0.0){
        println("Invalid Symbol entered")
    }
    else{
        println("Your answer is $answer")
    }
}

fun calculator(firstNumber:Double, secondNumber:Double, symbol:String):Double{
    when (symbol) {
        "*" -> return firstNumber * secondNumber
        "+" -> return firstNumber + secondNumber
        "-" -> return firstNumber - secondNumber
        "/" -> return firstNumber / secondNumber
        else -> return 0.0
            
    }
}
