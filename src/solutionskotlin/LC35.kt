package solutionskotlin

fun main() {

}

fun searchInsert(nums: IntArray, target: Int): Int {
    var start = 0
    var end = nums.size - 1
    while (start <= end) {
        val mid = start + (end - start) / 2
        if (nums[mid] == target) {
            return mid
        } else if(nums[mid] > target) {
            end = mid - 1
        } else {
            start = mid + 1
        }
    }
    return start
}