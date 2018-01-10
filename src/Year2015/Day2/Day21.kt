package Year2015.Day2

import Solver

class Day21(filePath: String) : Solver(filePath) {

    var sum = 0L

    override fun forEachLine(index: Int, line: String): Boolean {

        val numbers = ShortArray(3)
        line.split("x")
                .forEachIndexed { i, num ->
                    numbers[i] = num.toShort()
                }

        val area = arrayOf(numbers[0] * numbers[1],
                numbers[1] * numbers[2],
                numbers[2] * numbers[0])

        sum += area.sumBy { 2 * it } + area.min()!!

        return false
    }

    override fun displayResult() {
        print("Required wrapper $sum")
    }
}