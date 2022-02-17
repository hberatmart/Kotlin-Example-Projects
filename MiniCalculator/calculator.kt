fun main(){
    var x: Int
    var y: Int
    var operators: Int
    print("Please enter a number: ")
    x = readLine()!!.toInt()
    print("Please enter a number: ")
    y = readLine()!!.toInt()
    print("1 -> +\n 2 -> -\n 3 -> *\n 4 -> /\n Please enter a number: ")
    operators = readLine()!!.toInt()
    val result = if (operators == 1) x + y else if (operators == 2) x - y else if (operators == 3) x * y else if (operators == 4) x / y else "Sorry!"
    println(result)

}