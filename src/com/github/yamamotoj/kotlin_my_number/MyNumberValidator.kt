package com.github.yamamotoj.kotlin_my_number

object MyNumberValidator {

    @JvmStatic
    fun validate(str: String): Boolean = str
            .apply {
                if (length != 12) {
                    throw IllegalArgumentException("")
                }
                if (!all { it.isDigit() }) {
                    throw IllegalArgumentException()
                }
            }
            .drop(1)
            .map {it - '0'}
            .reversed()
            .zip(1..11)
            .fold(0) { sum, elem ->
                val n = elem.second
                val pn = elem.first
                val qn = if (1 <= n && n <= 6) {
                    n + 1
                } else {
                    n - 5
                }
                sum + pn * qn
            }
            .let { it % 11 }
            .let {
                val checkDigit = str[0] - '0'
                when (it) {
                    0, 1 -> 0 == checkDigit
                    else -> it == checkDigit
                }
            }
}

