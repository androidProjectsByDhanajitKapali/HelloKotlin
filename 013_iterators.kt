//removing multiples of n from the list
fun dropMultiples(n:Int){
    for(i in 0 until arr.size){ //this will create error as in this loop
      if(i%n == 0){             //the size() of the arr[] is changing after every
        arr.remove(i)           //removal of the ,this will create error
      }
    }
}
//now using iterators to remove this error
val arr = ArrayList<Int>()
fun main(){
    for(i in 0 until 50){
        arr.add(i)
    }
    dropMultiples(5)

    val itr = arr.iterator()   //printing the array
    while(itr.hasNext()) {
        val i = itr.next()
        print("${i} ")
    }
}
fun dropMultiples(n:Int){
    val itr = arr.iterator()
    while(itr.hasNext()){
        val i = itr.next()
        if(i%n == 0){           //removing the multiples of 5
            itr.remove()
        }
    }
}
