class UserProfileConstructorOverloading(var Name:String,var Age:Int = 0,var PhoneNumber:String = "",var Email:String = ""){
    override fun toString(): String {
        return "UserProfile:" +
                "\n Name is $Name" +
                "\n Age is $Age" +
                "\n PhoneNumber is $PhoneNumber" +
                "\n Email is $Email \n"
    }
}

//fun main(args : Array<String>) {
//    val User1 = UserProfileConstructorOverloading(Name="Faizan",Age=25,PhoneNumber = "0345123123213")
//    print(User1)
//    val User2 = UserProfileConstructorOverloading(Name="Salman", Age = 22,Email = "asdas@gmail.com")
//    print(User2)
//}

