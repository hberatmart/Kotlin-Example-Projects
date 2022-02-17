fun main(){
    print("Please enter a number: ")
    val a = readLine()!!.toInt()
    print("Please enter a number: ")
    val b = readLine()!!.toInt()
    print("Please enter a operator(Addition, Subtraction, Multiplication, Division): ")
    val arithmeticOperators = readLine().toString()

    val operator: Operators = Operators.valueOf(arithmeticOperators.uppercase())
    val functions = when (operator) {
        Operators.ADDITION -> addition(a,b)
        Operators.SUBTRACTION -> subtraction(a,b)
        Operators.MULTIPLICATION -> multiplication(a,b)
        Operators.DIVISION -> division(a,b)
    }
    println("Result: $functions")

}

fun addition(x: Int , y: Int): Int = x + y
fun subtraction(x: Int , y: Int): Int = x - y
fun multiplication(x: Int , y: Int): Int = x * y
fun division(x: Int , y: Int): Int = x / y

enum class Operators {
    ADDITION , SUBTRACTION , MULTIPLICATION , DIVISION
}