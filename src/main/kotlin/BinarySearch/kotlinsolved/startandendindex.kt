package BinarySearch.kotlinsolved

import java.util.Objects


fun main(){

    val name = arrayOf(1,2,3,4,5)
    val new = IntArray(2)
    new[0] = SearchWith.binarySearchForCeelingandFloor(name, 4, true)
    new[1]=SearchWith.binarySearchForCeelingandFloor(name,4,false)
    val output = SearchWith.ordinarybinarySearch(name, 6)
    println(new.toList())

}
class SearchWith {
    companion object {

        fun ordinarybinarySearch(input: Array<Int>, target: Int): Int {

            var startIndex = 0;
            var endIndex = input.size - 1

            while (startIndex < endIndex) {

                val midpoint = startIndex + (endIndex - startIndex) / 2

                if (target == input[midpoint]) {
                    return midpoint
                } else if (target < input[midpoint]) {
                    endIndex = midpoint - 1
                } else if (target > midpoint) {
                    startIndex = midpoint + 1
                }

            }

            return 0
        }

        fun binarySearchForCeelingandFloor(input: Array<Int>, target: Int, ceeling:Boolean): Int {

            var startIndex = 0;
            var endIndex = input.size - 1

            while (startIndex <= endIndex) {

                val midpoint = startIndex + (endIndex - startIndex) / 2


                 if (target < input[midpoint]) {
                    endIndex = midpoint - 1
                } else if (target > midpoint) {
                    startIndex = midpoint + 1
                }



            }
            return if(ceeling) startIndex else endIndex-1
        }


    }


}


