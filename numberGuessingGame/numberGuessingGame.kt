import java.util.*

fun main(){
    numberGuessingGame()
}

fun yesOrNo(){
    var yesNo: String

    while (true) {
        print("Do you want to continue the game (Answer: Yes or No)?: ")
        yesNo = readLine().toString()
        if (yesNo.uppercase() == "NO") {
            println("Come back and just play")
            break
        } else if (yesNo.uppercase() == "YES") {
            println("Good luck :)")
            numberGuessingGame()
        } else {
            println("Please enter yes or no")
            yesOrNo()
        }
    }
}

fun numberGuessingGame() {
    var ran = Random()
    // the system starts from scratch. but we added one and the system will start from one now
    var number = ran.nextInt(100) + 1
    var myNumber: Int
    var cntr = 1

    while (true) {

        print("Please enter a number: ")
        myNumber = readLine()!!.toInt()

        if (myNumber > number){
            println("please reduce your number")
            cntr++
        } else if (myNumber < number) {
            println("please increase your number")
            cntr++
        } else {
            println("Congratulations, your ${cntr}th answer is correct")
            yesOrNo()
        }
    }
}