package solutionskotlin

fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
    return target.sorted() == arr.sorted()
}