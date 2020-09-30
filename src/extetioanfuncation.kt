fun  String.hii() : String = " Hii :) $this"
fun String.printHii() : Unit = println("Hii :) $this")
fun main() {
    val name = "Ummi kolbia"
    println(name.hii())
    name.printHii()
    "Ummi". printHii()
}


