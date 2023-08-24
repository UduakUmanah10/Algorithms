package linearsearch


fun main(){

    //treat arrays in kotlin as object always use their object methods.

    val data:ArrayList<IntArray>  = ArrayList(3)
    data.add(intArrayOf(1,2,3))
    data.add(intArrayOf(4,5,6))
    data.add(intArrayOf(7,8,9))

    val output = twoDAdd(data, )
    println(output)

}


fun twoDBinarySearch(input:ArrayList<IntArray>, target:Int): Array<Int>{

    val defa = emptyArray<Int>()
    var ou = Array<Int>(2){0}
    var outPut= emptyArray<Int>()

    for (row in 0 until input.size){

        for (colun in 0 until input[row].size){
            if(target == input[row][colun]){
                ou[0] = row
                ou[1] = colun
                return ou
            }
        }
    }

    return defa

}
fun twoDAdd(input:ArrayList<IntArray>): Int
{
    var min = 0
    //always start kotlin forloop with 0 and use the until
    for (row in 0 until input.size){
        var init = 0
        for (colun in 0 until input[row].size){
                init += input[row][colun]
        }
        if (min < init) min= init
    }

    return min

}
