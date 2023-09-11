package BinarySearch.kotlinsolved

/**
 * given an array [2,3,5,9,14,15,16,18] and a target of 15 is selected
 * the celing is the smallest number in the array greater or equal to the
 * target element. here the target celing here is 15
 *
 *[solution]
 * note that at the break point start = end+1 because the break condition is as follows
 * while(start<= end){ // do something}
 * therefore array[start] would be your answer
 *
 * for floor of the array[end] would be returned
 * */
fun main(){
    val input = intArrayOf(2, 3, 5, 9, 14, 15, 16, 18)
    val output= ceeling(input, 18)

    println(output)

}

fun ceeling( input: IntArray, target: Int):Int{

    var start = 0
    var end = input.size-1

    while (start<= end){
        val midpoint = start +(end-start)/2

        if(target>input[input.size-1] || target< input[0]){
            return  0
        }

        if (target== input[midpoint]){
            return input[midpoint]
        }else if (target< input[midpoint]){
            end = midpoint-1
        }
        else{
            start =midpoint+1
        }
    }

    return input[start]
}

