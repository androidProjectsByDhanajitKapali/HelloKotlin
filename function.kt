fun main()
{
    val name = getName()
    print(name)

    details("Dhanajit" , 20 , true)     //positional
    details2(age = 21 ,name = "pankaj" , isActive = false)   //named
    details3("dhanajit") //default

    variableArg(1,2,3,4,5,6,7,8,9,10)
}

fun getName():String
{
    return "Dhanajit"
}

// ways to return from the function
fun square1(number: Int) : Int
{
    return number * number
}

fun square2(number: Int) = number * number

fun square3(number: Int) : Int = number * number

fun square4(number: Int) = if(number>0){number*number} else number

//types of arguments
/*  1) positional argument
    2) named arguments
    3) default arguments
 */
fun details(name :String , age:Int , isActive: Boolean)     //positional
{
    println(" Name is $name , age is $age , active $isActive")
}

fun details2(name :String , age:Int , isActive: Boolean)     //named
{
    println(" Name is $name , age is $age , active $isActive")
}

fun details3(name :String , age:Int = 18 , isActive: Boolean = false)     //default
{
    println(" Name is $name , age is $age , active $isActive")
}

//variable arguments in kotlin
fun variableArg(vararg number: Int)
{
    println(number.size)
    for (no in number)
    {
        print(no)
        print(" ")
    }
}

