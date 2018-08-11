open class Person(var Name:String,var Age:Int){

    fun getNameAge():String{
        return "Name is $Name \n" +
                "Age is $Age \n"
    }
}

fun main(args : Array<String>) {
    val User1 = UserProfile(Name = "Salman",Age = 21,PhoneNumber = "123123213",Email = "sas@gmail.com")
    print(User1.toString())
}