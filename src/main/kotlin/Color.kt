open class Color( var name: String  , var symbol: String , var  hexcode: String) {
    open fun attributes():Array<String>{
        return  arrayOf(name, symbol, hexcode)
    }
}

class Rainbow(name: String,symbol:String,hexcode:String) : Color(name,symbol,hexcode) {
    override fun attributes():Array<String>{
        return arrayOf("Red", "orange", "yellow", "green", "blue", "indigo", "violet")
    }
}

fun main(){
    val ob1=Color("Black","tt","#FFFFF")
    println(ob1.attributes())

    val ob2=Rainbow("Black",  "ttt","#FFFFFFF")
    println(ob2.attributes())
}OOp use of arrays to return multiple strings