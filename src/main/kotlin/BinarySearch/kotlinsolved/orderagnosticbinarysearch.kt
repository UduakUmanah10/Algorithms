package BinarySearch.kotlinsolved

fun main(){
    val input = intArrayOf(5, 7, 7, 8, 8, 8, 10)
    val output = ans(input, 8)
    println(output.toList())


}

fun ans(input: IntArray, target: Int):IntArray{
    val answer = intArrayOf(-1,-1)
    answer[0] = startandendposition(input, target, true)
    answer[1] = startandendposition(input, target, false)

    return  answer
}

fun startandendposition(input:IntArray, target:Int, startPosition:Boolean):Int{

    var start =0
    var end = input.size-1
    var ans = 0

    while (start<=end){
        val midpoint = start+(end-start)/2
        if (target>input[midpoint]){
            start =midpoint+1
        }else if(target<input[midpoint]){
            end = midpoint-1
        }
        else{
            ans =midpoint
            if(startPosition){
                end =midpoint-1
            }else{
                start =midpoint+1
            }
        }
    }
    return ans

}