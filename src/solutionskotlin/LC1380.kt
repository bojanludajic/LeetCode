package solutionskotlin

fun main() {
    var matrix = arrayOf(intArrayOf(3, 7, 8), intArrayOf(9, 11, 13), intArrayOf(15, 16, 17))
    println(luckyNumbers(matrix))
}

fun luckyNumbers (matrix: Array<IntArray>): List<Int> {
    val mins = matrix.map { row -> row.min()!! }
    var maxes = mutableListOf<Int>()
    for(i in matrix[0].indices) {
        var max = 0
        for(j in matrix.indices) {
            max = maxOf(max,matrix[j][i])
        }
        maxes.add(max)
    }
    return mins.filter { it -> maxes.contains(it) }
}