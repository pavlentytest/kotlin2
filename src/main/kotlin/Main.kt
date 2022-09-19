import java.util.*

fun main() {
    var x: String? = "abc900";
    //x = null
    val l: Int = x?.length ?: -1
    println(l)

 /*   var y = readLine()?.toInt()
    when(y) {
        1 -> print("x = 1")
        2 -> print("x = 2")
        else -> print("else")
    }*/

    //Аналогична switch case

    var a = 20
    when(a) {
        10 -> {
            println(10)
            a *= 2
        }
        20 -> {
            println(20)
            a *= 5
        }
    }
    println(a)

    var u = 30
    when (u) {
        20,30 -> println("20 or 30")
        else -> println("other")
    }

    val z = 20
    when (z) {
        !in 40 .. 60 ->println("!40..60")
        in 10..21 -> println("10..21")
        else -> println("undefined!")
    }

    val a1 = 20
    val b1 = 30
    val c1 = 40
    when (a1) {
        b1 - c1 -> println("a1 = b1 - c1")
        b1 - 10 -> println("a1 = b1 - 10")
    }

    val h1 = 10
    val h2 = 20
    when (h1+h2) {
        30 -> println("10+20")
    }

    // when как альтернатива if...else
    val k1 = 15
    val k2 = 6
    when {
        (k2 > 10) -> println("k2 > 10")
        (k1 > 10) -> println("k2 > 10")
    }

    // when возращает значения
    val sum = 1000
    val p = when(sum) {
        in 100 ..999 -> 10
        in 1000..9999 ->15
        in 10 downTo 1 -> 888
        else -> 20
    }
    println("p=$p")

    // циклы
    for(n in 1..9){
        print("${n * n} \t")
    }

    for(i in 1..9){
        for(j in 1..9){
            print("${i * j} \t")
        }
        println()
    }

    var i = 10
    while(i > 0){
        println(i*i)
        i--;
    }

    var ii = -1
    do{
        println("first = $ii")
        ii--;
    }
    while(ii > 0)


    // coninue - переходим к следующей итерации
    for(n in 1..8){
        if(n == 5) continue;
        println(n * n)
    }

    // break - выход из цикла
    for(n in 1..5){
        if(n == 5) break;
        println(n * n)
    }

    // интервалы
    // https://metanit.com/kotlin/tutorial/2.8.php

    // var range = 1..5


    var range = 'd'..'f'
    println(range::class)
    for(i in range) {
        println("i = $i")
    }

    // Массивы
    // https://metanit.com/kotlin/tutorial/2.3.php
    main2()
    println(sum(4,2))

    val m = -4
    val n = 3

    println(m % n) // -1
    println(m.mod(n)) // 2

    // https://blog.jetbrains.com/ru/kotlin/2021/04/kotlin-1-5-0-rc-released/#%D0%9C%D0%B0%D1%82%D0%B5%D0%BC%D0%B0%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D0%B5_%D0%BE%D0%BF%D0%B5%D1%80%D0%B0%D1%86%D0%B8%D0%B8_%D1%86%D0%B5%D0%BB%D0%BE%D1%87%D0%B8%D1%81%D0%BB%D0%B5%D0%BD%D0%BD%D0%BE%D0%B5_%D0%B4%D0%B5%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5_%D0%B8_%D0%BE%D0%BF%D0%B5%D1%80%D0%B0%D1%82%D0%BE%D1%80_mod
    println("Truncated division -5/3: ${-5 / 3}")
    println("Floored division -5/3: ${(-5).floorDiv(3)}")


}
fun volume(height: Int, width: Int, length: Int): Int {
    fun area(a: Int, b: Int) = a * b
    return height * area(width, length)
}
fun main2() {
    var rand = Random()
    val intAr = IntArray(10, {rand.nextInt(300)})
    var sum = 0
    for (i in intAr){
        print(i.toString()+", ")
        if (i % 2 == 0)
            sum += i
    }
    println(sum)

}

fun sum(a: Int, b: Int) : Int{
    return a + b
}

fun sum(a: Double, b: Double) : Double{
    return a + b
}
fun sum(a: Int, b: Int, c: Int) : Int{
    return a + b + c
}
fun sum(a: Int, b: Double) : Double{
    return a + b
}
fun sum(a: Double, b: Int) : Double{
    return a + b
}