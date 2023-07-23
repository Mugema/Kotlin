fun main(){
    val option1: String = "Pizza"
    val option2: String = "Chicken"
    val option3: String = "Pancakes"
    val option4: String = "Cake"
    var answer: String?

    println("Options \n\t1.$option1\n\t2.$option2\n\t3.$option3\n\t4.$option4\n Enter an option:")
    answer = readln()

    if (answer == option1) {
        println("You will go to pizza hut")
    }else if (answer==option2) {
        println("You will go to kfc")
    }else if(answer==option3) {
        println("You will go to foodhub")
    }else if (answer==option4){
        println("You will go to cakely")
    }
}