var list_of_names = listOf<String>("dhana" , "abhi" , "pankaj" , "bandar")  //it is imutable
var mutable_list_of_names = mutableListOf<String>("dhana" , "abhi" , "pankaj" , "bandar")   //its mutable
var mutable_array = arrayListOf<Int>(1,2,3,4,5)    //its also mutable
var mymap = mapOf<Int,String>(1 to "dhana" , 2 to "abhi" , 3 to "pankaj" , 4 to "bandar") //its imutable

var mymap2 = mapOf(1 to "dhana" , 2 to "abhi" , "singh" to "sardar") //its imutable
var hash_map = hashMapOf<Int,String>(1 to "dhana" , 2 to "abhi" , 3 to "pankaj" , 4 to "bandar") //its mutable
fun main()
{
    println(list_of_names.get(3))

    mutable_list_of_names.add("aggarwal")
    println(mymap[2])

    hash_map.set(5 , "sardar")
    hash_map[3] = "masiwal"
    println(hash_map[3])
    println(hash_map[5])
}