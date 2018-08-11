
fun main(args : Array<String>) {
    println("Which is your Favourite Binary, 1 or 0: ")
    val input = readLine()!!.toInt()

    if(input == 1){
        print("1 in Binary means True")
    }else if(input == 0){
        print("0 in Binary means False")
    }else{
        print("It is not a Binary!")
    }
}

