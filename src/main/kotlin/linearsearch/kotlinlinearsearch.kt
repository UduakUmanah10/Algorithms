package linearsearch

import sortAlgorithms.insertionsortAlgorithms

class kotlinlinearsearch {

    fun inp(inr:Array<IntArray>, input:Array<Int>){
        for (i in 1..inr.size){
            for (c in 1..inr[i].size){

            }
        }


        for (i in 0 until (input.size - 1))
        {
            for (j in i + 1 downTo 1) {
                if (input.get(j) < input.get(j - 1)) {
                    insertionsortAlgorithms.swap(input, j, j - 1)
                } else {
                    break
                }
            }
        }
    }


    //i < input.length-1 is equivalent to the length of the array -2

}