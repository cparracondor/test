
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.concurrent.atomic.AtomicLong

fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")

fun main() {


    val c = AtomicLong()

    for (i in 1..1_000_000L)
        GlobalScope.launch {
            c.addAndGet(i)
        }

    println(c.get())
}