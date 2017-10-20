fun higherOrderTest(fn: () -> String) {
    println(fn())
}

fun highterOrderTest2(message: String, fn: () -> Unit) {

}

fun higherOrderTest3() {
    higherOrderTest {
        "Hello World"
    }

    highterOrderTest2("Hello") {
        val noop = 0
    }
}
