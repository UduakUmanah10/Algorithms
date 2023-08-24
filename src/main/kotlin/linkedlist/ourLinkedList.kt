package linkedlist

class ourLinkedList<T> {

    private var head:Node<T>?= null
    private var tail:Node<T>? = null
    private var size:Int = 0

    fun isLinkedlistEmpty():Boolean{
       return size == 0
    }



    fun pushElement(value:T){
        head = Node(value, nextNode = head  )

        if (tail == null){
            tail = head
        }
        size+=1
    }

    fun appendElement(value:T){
        //make the head first element as the head and tail
        if(isLinkedlistEmpty()){
            pushElement(value)
            return
        }

        tail?.nextNode = Node(value)
        tail = tail?.nextNode
        size+=1

    }

    override fun toString(): String {
        return if ( isLinkedlistEmpty() )
        { "our list is empty"
        }  else{
            head.toString()}
    }


}