var arr4 = arrayOf(1,2,3,4,5,6)
var hash_map1 = hashMapOf<Int,String>(1 to "dhana" , 2 to "abhi" , 3 to "pankaj" , 4 to "bandar") //its mutable
fun main()
{
   hash_map1.forEach{any , any2 -> println( "" + any + " " +any2)}

    arr4.forEach {
        print("" + it + " ")
    }
    println()
    for(i in arr4)
    {
        print(i)
    }
    println()
    for(i in 0..5)
    {
        print(i)    //5 is inclusive
    }
    println()
    for(i in 0 until 5)
    {
        print(i)    //5 is excluded
    }
    println()
    for(i in 0 until 10 step 2)
    {
        print(i)
    }
    println()
    for(i in 10 downTo 0 step 2)
    {
        print(i)
    }
}