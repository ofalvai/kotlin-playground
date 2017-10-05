fun platformTypeTest() {
    val stringList = ArrayList<String>()
    stringList.add("First item")

    val secondItem = stringList[1]

    doSomething(secondItem)

    val length = secondItem.length
}

fun doSomething(value: String) {
    println(value)
}