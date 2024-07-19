package solutionskotlin

fun main() {
}

fun threeConsecutiveOdds(arr: IntArray): Boolean {
     return arr.asList().windowed(3).any { window -> window.all { it % 2 == 1} }
}