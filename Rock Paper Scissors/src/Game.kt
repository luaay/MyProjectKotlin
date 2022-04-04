import java.awt.Choice
import java.util.*


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

        val userInput = readLine()?.uppercase()

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

class employee {
    // properties
    var name: String = ""
    var age: Int = 0
    var gender: Char = 'M'
    var salary: Double = 0.toDouble()
    //member functions
    fun name(){

    }
    fun age() {

    }
    fun salary(){

    }
}



class Registration( email: String, pwd: String, age: Int , gender: Char) {

    var email_id: String = email
        // Custom Getter
        get() {
            return field.lowercase(Locale.getDefault())
        }
    var password: String = pwd
        // Custom Setter
        set(value){
            field = if(value.length > 6) value else throw IllegalArgumentException("Passwords is too small")
        }

    var age: Int = age
        // Custom Setter
        set(value) {
            field = if(value > 18 ) value else throw IllegalArgumentException("Age must be 18+")
        }
    var gender : Char = gender
        // Custom Setter
        set (value){
            field = if(value == 'M') value else throw IllegalArgumentException("User should be male")
        }
}


