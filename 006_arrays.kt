var nums = arrayOf(1,2,3,4,5)
var arr = arrayOf(1,2,3,"a")    //can store different ypes of elements
var names = arrayOf<String>("dhana" , "abhi" , "pankaj" , "bandar")     //only String type elements

var arr1 = Array(5 , {i->i})    //using Array class constructor

var arr3 = arrayOf<Int>(0)

var num_array = intArrayOf(1,2,3,4,5) //only int type elements

var null_array = arrayOfNulls<String>(10)   //array initialized with null
fun main()
{
    arr3.set(0,7)   //updating the index 0 of arr3
    
    println(arr3[0])
    println(arr1[4])
    println(names[0])
    println(nums.get(0))

}