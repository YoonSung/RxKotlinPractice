package step2
    
fun main(args :Array<String>) {
    
    //start counting backwards from 100 and try only even numbers.
    //for (i in 100 downTo 1 step 2) println(i)
    //for (i in 100..1 step 2) println(i)
    println("Kotlin".lastChar())
    val b = false;
    println("I ${if (b) "got" else "lost"} focus.")
}

fun String.lastChar(): Char = this.get(this.length - 1)