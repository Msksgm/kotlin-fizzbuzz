package fizzbuzz_sealed

// 1. sealed 修飾子がついたオブジェクトはクラスの外側で定義されたクラスを継承先にできない
sealed interface FizzBuzzInterface {
    object Fizz : FizzBuzzInterface {
        fun getFizz(): String {
            return "Fizz"
        }
    }

    object Buzz : FizzBuzzInterface {
        fun getBuzz(): String {
            return "Buzz"
        }
    }

    object FizzBuzz : FizzBuzzInterface {
        fun getFizzBuzzWord(): String {
            return "FizzBuzz"
        }
    }

    class OtherWord(private val value: Int) : FizzBuzzInterface {
        fun getOtherWord(): String {
            return "$value"
        }
    }
}

fun main(args: Array<String>) {
    val n = 20

    // 2. コレクション関数で List<FizzBuzzClass> 型の配列を作成
    val fizzBuzzList: List<FizzBuzzInterface> = IntArray(n) { it + 1 }.map {
        when {
            it % 15 == 0 -> {
                FizzBuzzInterface.FizzBuzz
            }

            it % 3 == 0 -> {
                FizzBuzzInterface.Fizz
            }

            it % 5 == 0 -> {
                FizzBuzzInterface.Buzz
            }

            else -> {
                FizzBuzzInterface.OtherWord(it)
            }
        }
    }
    fizzBuzzList.forEach {
        // 3. when 式は型に対してパターンマッチが可能。スマートキャストもされる
        val word = when (it) {
            is FizzBuzzInterface.Buzz -> {
                it.getBuzz()
            }

            is FizzBuzzInterface.Fizz -> {
                it.getFizz()
            }

            is FizzBuzzInterface.FizzBuzz -> {
                it.getFizzBuzzWord()
            }

            is FizzBuzzInterface.OtherWord -> {
                it.getOtherWord()
            }
        }
        println(word)
    }
}
