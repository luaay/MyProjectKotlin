



fun main(args:Array<String>){

    val options=arrayOf("Rock","Paper","Scissors")

    val gameChoice = getGameChoice(options)

    val userChoice = getUserChoice(options)


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

        val userInput = readLine()

        if (userInput != null && userInput in optionParam){

            isValidChoice = true

            userChoice = userInput
        }

        if (!isValidChoice) println("you must enter a vaild choice.")

    }
    return  userChoice

}
