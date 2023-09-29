package sortAlgorithms
fun main() {
    val arr = intArrayOf(1, 3,4,2,2)
    val answer = repeatednumber().cyclicSort(arr)
    println(answer)
}
class repeatednumber {

    public fun cyclicSort(input: IntArray): List<Int> {
        var i = 0
        val ans: MutableList<Int> = ArrayList()
        while (i < input.size) {
            val correct = input[i] - 1 //this is the correct index of element
            if (input[i] != input[correct]) {
                swap(input, i, correct)
            } else {
                i++
            }
        }
        println(input.contentToString())
        for (j in input.indices) {
            if (input[j] != j + 1) {
                ans.add(input[j])
            }
        }
        return ans
    }

    private fun swap(input: IntArray, i: Int, correct: Int) {
        val temp = input[i]
        input[i] = input[correct]
        input[correct] = temp
    }


    //when the

}