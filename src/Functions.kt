@JvmOverloads
fun displayList(items: List<String>, errorMessage: String = "Failed to load list") {
    // ...
}

fun test() {
    displayList(listOf("Java", "Scala", "Kotlin"))
    displayList(listOf("C++", "C#", "Python"), "Failed to load the languages")
}