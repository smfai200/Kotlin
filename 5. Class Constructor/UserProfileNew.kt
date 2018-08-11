class UserProfileNew(){

    var Name = ""
    var Age = 0
    var PhoneNumber = ""
    var Email = ""

    constructor(Name:String,Age:Int,PhoneNumber:String,Email:String):this(){
        this.Name = Name
        this.Age = Age
        this.PhoneNumber = PhoneNumber
        this.Email = Email
    }

    override fun toString(): String {
        return "UserProfile:" +
                "\n Name is $Name" +
                "\n Age is $Age" +
                "\n PhoneNumber is $PhoneNumber" +
                "\n Email is $Email \n"
    }
}

//fun main(args : Array<String>) {
//    val User1 = UserProfileNew(Name = "Faizan",Age = 21,PhoneNumber = "213123123123",Email = "sfasf@gmail.com")
//    print(User1)
//
//}
