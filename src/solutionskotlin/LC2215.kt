package solutionskotlin

fun main() {

}

fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    return listOf(
        nums1.filterNot { it in nums2 }
            .distinct(),
        nums2.filterNot { it in nums1}
            .distinct()
    )
}