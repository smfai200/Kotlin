
fun main(args : Array<String>) {
    println("What is the max number is your mind: ")
    var loop = readLine()!!.toInt()
    var i = 0
    do{
        println("$i  ")
        i++
    }while(i<=loop);
}

