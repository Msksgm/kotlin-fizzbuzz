package fizzbuzz_if

//冗長に書いたパターン
//fun fizzBuzz(i: Int): String {
//    val result: String
//    if (i % 15 == 0) {
//        result = "FizzBuzz"
//    } else if (i % 3 == 0) {
//        result = "Fizz"
//    } else if (i % 5 == 0) {
//        result = "Buzz"
//    } else {
//        result = "$i"
//    }
//    return result
//}

//早期 return にしたパターン
fun fizzBuzz(i: Int): String {
    if (i % 15 == 0) {
        return "FizzBuzz"
    } else if (i % 3 == 0) {
        return "Fizz"
    } else if (i % 5 == 0) {
        return "Buzz"
    } else {
        return "$i"
    }
}

fun main(args: Array<String>) {
    val n = 20
    for (i in 1..n) {
        println(fizzBuzz(i))
    }
}
