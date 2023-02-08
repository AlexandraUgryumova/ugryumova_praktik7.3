//2 8
fun main(){
    var S:Double = 0.0
    var P:Double = 0.0
    var p:Double
    var maxi: Double =0.0
    var sum: Double = 0.0
    var a: Double
    var b: Double
    var c: Double
    while(true){
        println("")
        a = readln()!!.toDouble()
        println("")
        b= readln()!!.toDouble()
        println("")
        c = readln()!!.toDouble()
        if(b>c){
            if(b>a)
            {maxi = b
                sum = a+c}
            else
            {maxi = a
                sum = c+b}
        }
        else {
            if (c > a) {
                maxi = c
                sum = a + b
            } else {
                maxi = a
                sum = c + b
            }

        }
        if (sum > maxi && a > 0.0 && b > 0.0 && c > 0.0) {
            break
        } else {
            println("числа введены неверно")
        }
    }
    P = a+b+c
    p = P/2
    S= Math.sqrt(p*(p-a)*(p-b)*(p-c))
    println("S = $S; P = $P")
}