var name:String? = null
fun main()
{
    name = "Dhanajit"
    val size:Int = name?.length?:0  // elvis operator
    print(size)
}

//var can be reassigned
//val can't be reassigned