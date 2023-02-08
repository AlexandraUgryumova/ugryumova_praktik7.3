//1 8
fun main(){
    while(true){
        try{
            println("y = a*x^2 +b*x +c")
            println("a:")
            val a: Double = readln()!!.toDouble()
            print("b:")
            val b: Double = readln()!!.toDouble()
            println("c:")
            val c: Double = readln()!!.toDouble()
            var x: Double = -(b / (a*2))
            var y: Double = (4* a*c - Math.pow(b, 2.0))/(4*a)
            println("($x, $y)")
        }
        catch(e: Exception){
            println("числа введены неправильно")
        }
    }
}