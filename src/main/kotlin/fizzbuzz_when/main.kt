package fizzbuzz_when

//冗長に書いたパターン
//fun fizzBuzz(i: Int): String {
//    val result: String
//    when {
//        i % 15 == 0 -> {
//            result = "FizzBuzz"
//        }
//        i % 3 == 0 -> {
//            result = "Fizz"
//        }
//        i % 5 == 0 -> {
//            result = "Buzz"
//        }
//        else -> {
//            result = "$i"
//        }
//    }
//    return result
//}

//宣言と代入を同時におこなうパターン
//fun fizzBuzz(i: Int): String {
//    val result = when {
//        i % 15 == 0 -> {
//            "FizzBuzz"
//        }
//        i % 3 == 0 -> {
//            "Fizz"
//        }
//        i % 5 == 0 -> {
//            "Buzz"
//        }
//        else -> {
//            "$i"
//        }
//    }
//    return result
//}
//

//return の戻り値にするパターン
fun fizzBuzz(i: Int): String {
    return when {
        i % 15 == 0 -> {
            "FizzBuzz"
        }
        i % 3 == 0 -> {
            "Fizz"
        }
        i % 5 == 0 -> {
            "Buzz"
        }
        else -> {
            "$i"
        }
    }
}

//when 式から else を除くとコンパイルエラーが発生する
//fun fizzBuzz(i: Int): String {
//    return when {
//        i % 15 == 0 -> {
//            "FizzBuzz"
//        }
//        i % 3 == 0 -> {
//            "Fizz"
//        }
//        i % 5 == 0 -> {
//            "Buzz"
//        }
////        else -> {
////            "$i"
////        }
//    }
//}

fun main(args: Array<String>) {
    val n = 20
    for (i in 1..n) {
        println(fizzBuzz(i))
    }
}
