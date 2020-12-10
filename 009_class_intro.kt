fun main()
{
    val user:User = User()  //object creation of class User
    print(user.mobile)
}

class User
{
    var name:String = ""
    var mobile:Int = 955522
    var gender:String = ""
    var email:String = ""
    var bio:String = ""

    fun checkEmail():Boolean
    {
        return email.isNotEmpty()
    }

}