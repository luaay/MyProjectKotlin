



fun main(args:Array<String>){

    val options=arrayOf("Rock","Paper","Scissors")

    getGameChoice()
}

fun getGameChoice(optionParam: Array<String>) =
    (Math.random() * optionParam.size).toInt()

fun getGameChoice(){
    
}
