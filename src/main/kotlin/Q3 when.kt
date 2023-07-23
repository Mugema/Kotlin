fun main(){
    val option1: String = "Pizza"
    val option2: String = "Chicken"
    val option3: String = "Pancakes"
    val option4: String = "Cake"
    val answer: String?

    println("Options \n\t1.$option1\n\t2.$option2\n\t3.$option3\n\t4.$option4\n Enter an option:")
    answer = readln()

   when(answer){
       option1 -> println("You will go to pizza hut")
       option2 -> println("You will go to kfc")
       option3 -> println("You will go to foodhub")
       option4 ->println("You will go to cakely")
   }
}
