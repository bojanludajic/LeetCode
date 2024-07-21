package solutionskotlin

fun main() {
    val nums = intArrayOf(20, 100, 10, 12, 5, 13)
}

fun increasingTriplet(nums: IntArray): Boolean {
    var first = Integer.MAX_VALUE
    var second = Integer.MAX_VALUE
    for(num in nums) {
        when  {
            num <= first -> first = num
            num <= second -> second = num
            else -> return true
        }
    }
    return false
}

