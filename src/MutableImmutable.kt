var firstName = "John"
val lastName = "Doe"

fun changeName() {
    firstName = "Jane" // OK
    lastName = "Roe" // Error: val cannot be reassigned
    val newLastName = lastName.capitalize() // OK: új String példány
    lastName = newLastName // Error: val cannot be reassigned

    listOf()
}

