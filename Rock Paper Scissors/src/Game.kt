



fun main(args:Array<String>){

    val options=arrayOf("Rock","Paper","Scissors")

    val gameChoice = getGameChoice(options)

    var resul = timesthree(2)
}

fun getGameChoice(optionParam: Array<String>) =
    optionParam[ (Math.random() * optionParam.size).toInt()]

fun getGameChoice(){

}

fun getUserChoice(optionParam: Array<String>):String{

    for(item in optionParam) print(" $item")
    print(".")

}
