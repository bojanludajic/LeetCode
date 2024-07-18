package solutionskotlin

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val tar = 9
    val arr = twoSum(nums, tar)
    for(i in arr.indices){
        print("${arr[i]} ")
    }
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var map  = mutableMapOf<Int, Int>()
    for(i in nums.indices) {
        val compl = target - nums[i]
        if (map.containsKey(compl)) {
            return intArrayOf(map[compl]!!, i)
        }
        map[nums[i]] = i
    }
    return intArrayOf(0)
}