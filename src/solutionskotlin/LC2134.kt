package solutionskotlin

fun main() {
    val nums: IntArray = intArrayOf(1)
    println(minSwaps(nums))
}

fun minSwaps(nums: IntArray): Int {
    val oneCount = nums.count { it == 1}
    if(oneCount == 0) return 0
    val windowedOnes = (nums + nums).toList()
        .windowed(oneCount)
        .maxBy { it -> it.count { it == 1 } }
        .count { it -> it == 1}
    return oneCount - windowedOnes
}