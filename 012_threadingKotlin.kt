//inbuilt thread is being used
fun main(){
    printNum()
}
fun printNum(){
    for(i in 0 until 100){
        println("${Thread.currentThread().id} $i")
    }
}

//three diff threads being used
fun main(){
    Thread{ printNum() }.start()
    Thread{ printNum() }.start()
    Thread{ printNum() }.start()
}
fun printNum(){
    for(i in 0 until 100){
        println("${Thread.currentThread().id} $i")  //id will be random for each thread
    }
}

//giving each thread custom id
fun main(){
    Thread{ printNum("1") }.start()
    Thread{ printNum("2") }.start()
    Thread{ printNum("3") }.start()
}
fun printNum(id: String){
    for(i in 0 until 100){
        println("$id $i")
    }
}

//making the thread to sleep
fun main(){
    Thread{ printNum("1") }.start()
    Thread{ printNum("2") }.start()
    Thread{ printNum("3") }.start()
}
fun printNum(id: String){
    for(i in 0 until 100){
        if(id == "2" && i == 50){   //when thread 2 hits 50 it will go to sleep for 100 millisecond
            Thread.sleep(100)
        }
        println("$id $i")
    }
}
