class UserProfile(Name:String,Age:Int,var PhoneNumber:String,var Email:String):Person(Name,Age){

    override fun toString(): String {
        return "UserProfile:" +
                super.getNameAge() +
                "PhoneNumber is $PhoneNumber" +
                "\nEmail is $Email \n"
    }


}

//fun main(args : Array<String>) {
//    val User1 = UserProfile(Name = "Salman",Age = 20,PhoneNumber = "03333392390",Email = "sallu@gmail.com")
//    var User2 = UserProfile(Name = "Ibtihaj",Age = 20,PhoneNumber = "031292232132",Email = "ibtii@gmail.com")
//    println(User1)
//    println(User2)
//}