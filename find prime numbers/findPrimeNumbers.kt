fun main(){
    findPrimeNumbers()
}


fun yesNo(){
    var yesOrNo: String

    while (true) {
        print("Do you want to continue the game (Answer: Yes or No)?: ")
        yesOrNo = readLine().toString()
        if (yesOrNo.uppercase() == "NO") {
            println("Come back and just play")
            break
        } else if (yesOrNo.uppercase() == "YES") {
            println("Good luck :)")
            findPrimeNumbers()
        } else {
            println("Please enter yes or no")
        }
    }
}



private fun findPrimeNumbers(){
    var upperLimitNumber: Int
    var numberOfDivisors: Int

    print("Please enter a number: ")
    upperLimitNumber = readLine()!!.toInt()
    for (i in 2..upperLimitNumber) {
        numberOfDivisors = 0
        for (j in 1..i){
            if (i % j == 0) numberOfDivisors++
        }
        if (numberOfDivisors == 2){
            println(i)
        }
    }
    yesNo()

}