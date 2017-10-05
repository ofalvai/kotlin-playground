class Preferences @JvmOverloads constructor(val version: Int = 1,
                                            var debugEnabled: Boolean = false,
                                            val fileName: String = "default.pref",
                                            val filePath: String = "./config"
) {
    //...
}

fun constructorTest() {
    val defaultPref = Preferences()
    val customPref = Preferences(2, true, "custom.pref")
}