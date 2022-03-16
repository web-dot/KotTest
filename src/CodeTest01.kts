import java.util.*

fun main(){
   //println(sum(2, 4))
    //println(multiplyFloats(3.5f, 5.5f))
    //println(ASCIIOfNum('A'))
    //println(findQoutentReminder(10, 3))
    //println(checkIfEven(102212212))
    //println(ifVowelConsonent("v"))
    //println(findLargest(3, 3, 5))
    //println(checkLeap(2024))
    println(checkIfNumPositive(5))
}

fun checkIfNumPositive(a: Int): Boolean{
    return a > 0
}

fun checkLeap(year: Int): Boolean{
    var leap = false
    if(year % 4 == 0){
        if(year % 100 == 0){
            leap = year % 400 == 0
        }else{
            leap = true
        }
    }
    return leap
}
fun findLargest(a: Int, b: Int, c: Int): Int{
    if(a > b && a > c){
        return a
    }
    else if (b > a && b > c){
        return b
    }
    else{
        return c
    }
}

fun ifVowelConsonent(a: String): Boolean{
    return a=="a" || a=="e" || a=="i" || a=="o" || a=="u"
}

fun checkIfEven(a: Int): Boolean{
    return a % 2 == 0
}

fun findQoutentReminder(dividend: Int, divisor:Int){
    val r = dividend % divisor
    val q = dividend / divisor
    println("quotient is ${q} and remainder is ${r}")
}

/*
fun ASCIIOfNum(a: Char): Int{
    return a.toInt()
}
*/

fun multiplyFloats(a: Float, b: Float): Float{
    return a * b
}
fun sum(a: Int, b: Int)= a + b
fun printNum(){
    //Creates a reader instance which takes
    //input from standard input - keyboard
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    //nextInt() reads the next integr from the keyboard
    var integer: Int = reader.nextInt()

    //println() prints the following line to the output screen
    println("You entered: $integer")

}
main()