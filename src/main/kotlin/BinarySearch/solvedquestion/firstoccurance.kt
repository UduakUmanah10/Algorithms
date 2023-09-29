package BinarySearch.solvedquestion


fun main(){
  val j =  findAnyOccurrenceOf01("000111")
    println(j)

}

fun findAnyOccurrenceOf01(str: CharSequence): Int {

    var start = 1
    var end  = str.length- 1-1

    while (start<end){
        val midpoint = start +(end-start)/2

        if(str[midpoint] > str[midpoint +1] ){
            end = midpoint
        }else{
            start =midpoint + 1
        }
    }
    return start-1
}