
fun main(args:Array<String>){
    //your code
    println("any text")
    var x = 3
    val name ="aaa"
    x *= 10
    print("x is $x.")

    while (x>20){
        x -=1
        println("$x")
    }
    for(i in 1..10){
        x += 1
        println("$x")

    }
    if (x == 20){
        println("$x must equal 20")
    }else{
        println("$x is not 20")
    }
}