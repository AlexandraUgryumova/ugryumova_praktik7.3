//1 16
fun main(){
    while(true){
        try{
            println("введите скорость первого автомобиля")
            val v1: Double = readln()!!.toDouble()
            println("введите скорость второго автомобиля")
            val v2: Double = readln()!!.toDouble()
            println("введите расстояние между ними в начале")
            val S: Double = readln()!!.toDouble()
            println("введите время их передвижения")
            val T: Double = readln()!!.toDouble()
            var answer: Double = Math.abs(S-(v1*T+v2*T))
            println("расстояние между автомобилями через $T часов равно $answer")
        }
        catch(e: Exception){
            println("")
        }
    }
}