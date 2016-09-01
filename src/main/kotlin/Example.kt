//http://try.kotlinlang.org/#/Examples/Hello,%20world!/Simplest%20version/Simplest%20version.kt

data class Person(val name: String, val age: Int ?= 0)
data class Book(val name: String, val authors: List<String> ?= emptyList())
fun main(args: Array<String>) {
    //test1()
//    test2(null)
}

fun test1() {
    val persons = listOf(Person("Alice"), Person("Bob", age = 29))
    val oldest = persons.maxBy{ it.age ?:0 }
    println("The oldest is $oldest")


    val p1 = Person("test1")
    val p2 = Person("test1")
    val sed = setOf(p1, p2)
    println(sed.size)
    println(p1 == p2)
    println(sed.contains(p2))
    println(sed.contains(p1))

    val friends = listOf(Person("Alice", 31), Person("Bob", 31))
    val books = listOf(Book("1984", listOf("George Orwell")), Book("Catch-22", listOf("Joseph Heller")))

    //println(friends.zip(books).get(0).first)
    println(friends.firstOrNull{ it.name == "Alica" })
    println(friends.find { it.age ===  31})
}