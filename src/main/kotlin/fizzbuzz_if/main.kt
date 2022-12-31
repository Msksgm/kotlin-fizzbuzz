package fizzbuzz_if

fun fizzBuzz(i: Int): String {
    val result: String
    if (i % 15 == 0) {
        result = "FizzBuzz"
    } else if (i % 3 == 0) {
        result = "Fizz"
    } else if (i % 5 == 0) {
        result = "Buzz"
    } else {
        result = "$i"
    }
    return result
}

fun main(args: Array<String>) {
    val n = 20
    for (i in 1..n) {
        println(fizzBuzz(i))
    }
}
