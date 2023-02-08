//2 16
fun main(){
    var min: Double
    var max: Double
    while (true){
        try{
            println("y = a*x^2 + b*x + c")
            println("a:")
            val a: Double = readln()!!.toDouble()
            println("b:")
            val b: Double = readln()!!.toDouble()
            println("c:")
            val c: Double = readln()!!.toDouble()
            println("u:")
            val u: Double = readln()!!.toDouble()
            println("v:")
            val v:Double = readln()!!.toDouble()
            var x1:Double =-b/(2*a)
            if(x1<u || x1>v){
                println("у данного отрезка нет точек")
            }
            else{
                var f1: Double = a*Math.pow(x1,2.0) +b*x1+c
                var f2: Double = a*Math.pow(u,2.0)+b*u+c
                var f3: Double = a*Math.pow(v,2.0) +b*v+c
                max = Math.max(f1, f2)
                max = Math.max(max,f3)
                min = Math.min(f1, f2)
                min = Math.min(min, f3)
                println("max: $max;\nmin: $min")
            }
            break
        }
        catch(e:Exception){
            println("числа введены неправильно")
        }
    }
}