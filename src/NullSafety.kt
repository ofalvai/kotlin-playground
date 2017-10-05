class NullSafety {

    private fun getValueOrNull(): String? {
        return null
    }

    private fun process() {
        val value: String? = getValueOrNull()
        value?.let {
            val length: Int = value.length
            println("Length of $value: $length")
            saveValue(value)
        }

    }

    private fun saveValue(value: String) {

    }

    fun canReturnNull(): String? {
        return null
    }

    fun cantReturnNull(): String {
        return "NOT NULL"
    }
}