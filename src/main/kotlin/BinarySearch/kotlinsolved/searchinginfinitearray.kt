package BinarySearch.kotlinsolved

import BinarySearch.solvedquestion.BinarySerrchofinfinitarray

fun main(){
    val input = intArrayOf(3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170)
    val target = 10
    println(searchinfinite(input, target))
}


fun searchinfinite(input:IntArray, target: Int):Int {

    var start = 0
    var end = 1

    while (target > input[end]) {
        val newstart = end + 1
        end += (end - start + 1) * 2
        start = newstart
    }
    return binarySearch(input, target, start, end)
}
//the start and end point are not included in the binary search  but are controlled
//by another function because we do not know the end point of the array because it is infinite
fun binarySearch(input: IntArray, target: Int, start: Int, end: Int): Int {
    var start = start
    var end = end
    while (start <= end) {
        val midpoint = start + (end - start) / 2
        if (target == input[midpoint]) {
            return midpoint
        } else if (target > input[midpoint]) {
            start = midpoint + 1
        } else if (target < input[midpoint]) {
            end = midpoint - 1
        }
    }
    return -1
}