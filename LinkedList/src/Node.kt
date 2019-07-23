class Node {
    constructor(data: Int) {
        this.data = data
    }
    //setter is private so no one can set its value directly but can set value at the time of object creation through constructor
    constructor()
    {
        //Default constructor
    }
     var data: Int = 0
        private set
    var next: Node? = null
}