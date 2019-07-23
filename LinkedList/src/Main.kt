import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>) {
    var l1: LinkedList = LinkedList()
    try {

        for (i in 0..5) {


            l1.AddFirst(Integer.parseInt(readLine()))
        }


    }
    catch(e  : NumberFormatException)
    {
        println("May be wrong or null input")
    }
    println(">>>>>>Printing Numbers from Linked List")
   var temp= l1.ToArray()
    for ( i in temp)
        println(i)
    println(">>>>>>Printing First Number from Linked List")
    println(l1.GetFirst())
    println(">>>>>>Printing Last Number from Linked List")
    println(l1.GetLast())
    println(">>>>>>Printing Count of Linked List")
    println(l1.count)

}
