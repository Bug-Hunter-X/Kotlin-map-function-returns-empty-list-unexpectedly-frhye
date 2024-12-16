fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val emptyList = emptyList<Int>()
    val doubledEmptyList = emptyList.map { it * 2 }
    println(doubledEmptyList) // Prints [] which is expected

    val nullableList: List<Int>? = null
    val doubledNullableList = nullableList?.map { it * 2 } ?: emptyList()
    println(doubledNullableList) // Prints [] which is expected
} 