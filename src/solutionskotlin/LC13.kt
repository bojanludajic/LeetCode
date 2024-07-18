package solutionskotlin

fun main() {
    val roman = "IV"
    val converted = romanToInt(roman)
    print(converted)
}

fun romanToInt(s: String): Int {
    var map = mutableMapOf<Char, Int>()
    map['I'] = 1
    map['V'] = 5
    map['X'] = 10
    map['L'] = 50
    map['C'] = 100
    map['D'] = 500
    map['M'] = 1000
    var sum = 0
    for(i in 0..s.length-1) {
        val cur = map[s[i]]!!
        if(i < s.length - 1) {
            val next = map[s[i + 1]]!!
            if(cur < next) {
                sum -= cur
            } else {
                sum += cur
            }
        } else {
            sum += cur
        }
    }
    return sum
}