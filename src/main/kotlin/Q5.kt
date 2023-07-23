fun main(){
    val route1=5000
    val route2=25000
    val route3=50000
    val route4=10000
    val speed:Double= 20.0
    var time:Double
    println("Choose a route to take")
    val route:String= readln()

    if (route=="route1"){
        time=route1/speed
        println("You will spend $time hours on route1")
    }else if (route=="route2"){
        time=route2/speed
        println("You will spend $time hours on route2")
    }else if (route=="route3"){
        time=route3/speed
        println("You will spend $time hours on route3")
    }else if (route=="route4"){
        time=route4/speed
        println("You will spend $time hours on route4")
    }


}



