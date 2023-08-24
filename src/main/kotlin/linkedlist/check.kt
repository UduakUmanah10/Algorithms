package linkedlist

fun main(){
    val clist = ourLinkedList<Int>()

   // clist.pushElement(10)
    //clist.pushElement(20)
    //clist.pushElement(30)

    for(i in 1..20){
        clist.appendElement(i*2)

    }

    println(clist)
}