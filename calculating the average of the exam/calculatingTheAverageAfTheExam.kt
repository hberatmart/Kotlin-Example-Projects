fun main(){

    var fistExam: Int

    var secondExam: Int

    var lastExam: Int

    print("Please enter your first note: ")
    fistExam = readLine()!!.toInt()

    print("Please enter your second note: ")
    secondExam = readLine()!!.toInt()

    val addAverage: Int = (fistExam * 40 / 100) + (secondExam * 60 / 100)

    if (addAverage >= 50 && secondExam >= 50){
        println("Your note: $addAverage")
        println("congratulations you passed the lesson")
    }

    else {
        lastExam = ((50 - (fistExam * 40 / 100)) * 100 / 60) + 1
        println("You must score at least $lastExam on the last exam")
    }

}