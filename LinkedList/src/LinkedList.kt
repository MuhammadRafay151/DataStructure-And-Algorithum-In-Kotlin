//Single LinkedList
class LinkedList {
    private var Head: Node? = null
    private var Tail: Node? = null
    var count: Int = 0
        private set

    fun AddLast(Value: Int) {
        var node = Node(Value)

        if (Head?.next == null) {
            Head = Node()
            Head?.next = node
            Tail = node
            ++count
        } else {
            Tail?.next = node
            Tail = node
            ++count
        }
    }

    fun AddFirst(Value: Int) {
        var node = Node(Value)
        if (Head?.next == null) {
            Head = Node()
            Head?.next = node
            Tail = node
            ++count
        } else {
            node.next = Head?.next
            Head?.next = node
            ++count
        }
    }

    fun ToArray(): Array<Int?> {
        var temp: Node? = Head?.next


        var Value = Array<Int?>(count) { 0 }
        for (i in 0..count - 1) {
            Value[i] = temp?.data
            temp = temp?.next;
        }
        return Value
    }
fun GetFirst():Int? {
    return Head?.next?.data
}
    fun GetLast():Int? {
        return Tail?.data
    }


}