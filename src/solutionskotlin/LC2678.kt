package solutionskotlin

fun countSeniors(details: Array<String>): Int {
    return details.filter { it.substring(11, 13).toInt() > 60}
        .count()
}