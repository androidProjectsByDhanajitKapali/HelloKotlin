fun main()
{
    //getUser("kapali"){     }
    val program = Program()
    program.addTwoNum(2 ,7, object:Myinterface
    {
        override fun execute(sum:Int)
        {
            println(sum)
        }
    })
}
class Program
{
    fun addTwoNum(a:Int , b:Int , action:Myinterface)
    {
        val sum = a+b
        action.execute(sum)
    }
}
interface Myinterface
{
    fun execute(sum:Int)
}
fun getUser(name:String , doNothing:(isActive:Boolean) -> Unit):String
{
    if(name == "kapali")
    {
        doNothing(true)
    }
    else
    {
        doNothing(false)
    }
    return "Dhanajit"
}