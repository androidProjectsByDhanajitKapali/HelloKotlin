//when multiple threads write on some arr[] concurrently error can take place
//so copyOnWriteArrayList is used which is thread safe
import java.util.concurrent.CopyOnWriteArrayList

val arr = CopyOnWriteArrayList<Int>()
fun main(){
    for(i in 0 until 100){
        arr.add(i)
    }
    val itr = arr.iterator()  //passing a single iterators to all the threads
    Thread{ dropMultiples(3,itr) }.start()
    Thread{ dropMultiples(5,itr) }.start()
    Thread{ dropMultiples(10,itr) }.start()

    val it = arr.iterator()   //printing the arr[]
    while(it.hasNext()){
        val i = it.next()
        print("${i} ")
    }

}
fun dropMultiples(n:Int, itr: MutableIterator<Int>){
    while(itr.hasNext()){
    val i = itr.next()
        if(i%n == 0){           //removing the multiples of 3 , 5 , 7
            itr.remove()        //by each thread individually
        }
    }
}
