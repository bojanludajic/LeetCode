package solutionskotlin

fun main() {
    isHappy(19)
}

fun isHappy(n: Int): Boolean {
    var x = n
    var a = mutableSetOf<Int>()
    while(x !in a) {
        a.add(x)
        var digits = x.toString()
        var digSqSum = 0
        for(i in digits) {
            digSqSum += i.toString().toInt() * i.toString().toInt()
        }
        x = digSqSum
        println(digSqSum)
        if(x == 1) {
            return true
        }
    }
    return false
}