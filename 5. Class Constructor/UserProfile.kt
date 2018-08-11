class UserProfile(var Name:String,var Age:Int,var PhoneNumber:String,var Email:String){

    override fun toString(): String {
        return "UserProfile:" +
                "\n Name is $Name" +
                "\n Age is $Age" +
                "\n PhoneNumber is $PhoneNumber" +
                "\n Email is $Email \n"
    }


}

//fun main(args : Array<String>) {
//    val User1 = UserProfile(Name = "Salman",Age = 20,PhoneNumber = "03333392390",Email = "sallu@gmail.com")
//    var User2 = UserProfile(Name = "Ibtihaj",Age = 20,PhoneNumber = "031292232132",Email = "ibtii@gmail.com")
//    println(User1)
//    println(User2)
//}