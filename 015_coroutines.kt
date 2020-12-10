/* in intelliJ include
  repositories {
  mavenCentral()
  jcenter()
  }

  dependencies {
  implementation "org.jetbrains.kotlin:kotlin-stdlib"
  implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9"
  }
-> in the build.gradle file
*/

eg. code
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    println("Main thread start: ${Thread.currentThread().name}")    //will run via main thread

    //creating a coroutine on some background thread SAY ->"Thread T1"
    GlobalScope.launch {
        println("fake works start: ${Thread.currentThread().name}") //will run via T1 thread
        delay(100)          //will suspend coroutine but T1 will become free
        println("fake works ends: ${Thread.currentThread().name}")  //either via T1 or some other thread
    }

    //will call delay so that above coroutine get enough time to complete its work
    mySuspendFun(1000)
    println("Main thread ends: ${Thread.currentThread().name}") //will run via main thread
}

//here in this fun() to use delay() we used runBlocking{} , since delay can be called either from a
//suspending fun() or within a scope of a coroutine
fun mySuspendFun(time:Long){

    //this runBlocking{} will block the main thread and will create a coroutine on some background thread
    //via which delay will be called
    runBlocking {
        delay(time)
    }
}

/* OUTPUT :-
Main thread start: main
fake works start: DefaultDispatcher-worker-2
fake works ends: DefaultDispatcher-worker-2
Main thread ends: main
 */
