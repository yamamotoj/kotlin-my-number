package com.github.yamamotoj.kotlin_my_number

object MyNumberValidator {

    fun validate(str: String): Boolean = str
            .apply {
                if (length != 12) { throw IllegalArgumentException("") }
                if (!all { it.isDigit() }) { throw IllegalArgumentException() }
            }
            .take(11)
            .reversed()
            .map {it - '0'}
            .zip(1..11)
            .map{
                val n = it.second
                val p = it.first
                val q = if (n <= 6) { n + 1 } else { n - 5 }
                p * q
            }
            .sum()
            .let { 11 - it % 11 }
            .let {
                val checkDigit = str.last() - '0'
                when (it) {
                    0, 1 -> 0 == checkDigit
                    else -> it == checkDigit
                }
            }
}

