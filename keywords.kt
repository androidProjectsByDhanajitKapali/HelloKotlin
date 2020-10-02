val a:Any = "Pulkit"
val b:String = a as String
val name1 = "Dhanajit"
fun main()
{
    println(b)
    if(a is String)
    {
        println(a.length)
    }
    when(name1)
    {
        "Aggarwal" -> {println("Name")}
        "Raju" -> { println("singh")}
        "Dhanajit" -> {println("kapali")}
        else -> {println("not found")}
    }
    val q = 1
    val x:String = when(q)
    {
        1 -> "found"
        2 -> "two"
        else -> "not found"
    }
    println(x)
}