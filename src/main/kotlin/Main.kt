import linkedlist.Node
import linkedlist.ourLinkedList

fun main(args: Array<String>) {
    println("Hello World!")

    //val node1 = Node(value = 1)
    //val node2 =Node(value = 2)
    //val node3 = Node(value = 3)
    //val node4 = Node(value = 4)

    //node1.nextNode = node2
    //node2.nextNode =node3
    //node3.nextNode =node4

    //println(node1)

    val clist = ourLinkedList<Int>()
    clist.pushElement(10)
    clist.pushElement(20)
    clist.pushElement(30)
    println(clist)
}