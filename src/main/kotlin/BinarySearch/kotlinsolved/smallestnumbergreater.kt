package BinarySearch.kotlinsolved

import BinarySearch.solvedquestion.SmallestnumberGreaterThanTarget

fun main(){
    val input = charArrayOf('c', 'f', 'j')
    val target = 'd'

    val out = newSearch(input, target.code)
    println(out)

}

fun newSearch(input: CharArray, target: Int): Char {
    var start = 0
    var end = input.size - 1
    while (start <= end) {
        val mid = start + (end - start) / 2
        if (target < input[mid].code) {
            end = mid - 1
        } else {
            start = mid + 1
        }
    }
    return input[start % input.size]
}