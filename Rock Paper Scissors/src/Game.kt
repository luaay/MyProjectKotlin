import java.awt.Choice


fun main(args:Array<String>){

    val options=arrayOf("Rock","Paper","Scissors")

    val gameChoice = getGameChoice(options)

    val userChoice = getUserChoice(options)

    printResult(userChoice,gameChoice)

    
}

fun getGameChoice(optionParam: Array<String>) =
    optionParam[ (Math.random() * optionParam.size).toInt()]

fun getGameChoice(){

}

fun getUserChoice(optionParam: Array<String>):String{

    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice){
        print("Please enter one of the fillowing:")

        for(item in optionParam) print(" $item")
        print(".")

        val userInput = readLine().capitalize()

        if (userInput != null && userInput in optionParam){

            isValidChoice = true

            userChoice = userInput
        }

        if (!isValidChoice) println("you must enter a vaild choice.")

    }
    return  userChoice

}

fun printResult(userChoice:String, gameChoice: String){

    val result: String

    if ( userChoice == gameChoice) result = "Tie!"

    else if ((userChoice == "Rock" && gameChoice == "Scissors")

        || ( userChoice == "Paper" && gameChoice == "Rock")
        || (userChoice == "Scissors" && gameChoice == "Paper")) result = "You win!"
    else result = "you lose"

    println("$result")
}

class Rectangle(var width: Int, var height: Int){

    val isSquare: Boolean

    get()=(width == height)

    val area: Int
    get()=(width * height)




}