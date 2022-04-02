fun main(args:Array<String>){
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val aSize1 = wordArray1.size
    val asize2 = wordArray2.size
    val asize3 = wordArray3.size

    val rand1 = (Math.random() * aSize1).toInt()
    val rand2 = (Math.random() * asize2).toInt()
    val rand3 = (Math.random()* asize3).toInt()

    val p = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"

    println(p)

    val aaa = "my array is ${if(wordArray2.size >2) "latge" else "small"}"
    println(aaa)



    val fruit = arrayOf("Apple","Banana","Cherry","Blueberry","Pomoeg.")
    var x = 0
    val index = arrayOf(1,3,4,2)
    var y: Int
    while (x < 4){
        y=index[x]

        println("Fruit = ${fruit[y]}")
        x+=1
    }

}