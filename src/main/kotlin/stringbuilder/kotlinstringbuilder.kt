import java.text.DecimalFormat

fun main(){
    var series: String? = ""
    val format = DecimalFormat("00.0000")

    val formatted = format.format(7.33333)
    println(formatted)
    val builder = StringBuilder()
    for (i in 0..25) {
        val ch = ('a'.code + i).toChar()
        series += ch
        builder.append(ch)
        println(ch)
    }
    println(series)

    val bf = StringBuffer()

}

object stringbuillder {
    @JvmStatic
    fun main(args: Array<String>) {
        var series: String? = ""
        val builder = StringBuilder()
        for (i in 0..25) {
            val ch = ('a'.code + i).toChar()
            series += ch
            builder.append(ch)
            println(ch)
        }
        println(series)
    }
}
