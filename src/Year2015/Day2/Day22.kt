package Year2015.Day2

import Solver

class Day22(filePath: String) : Solver(filePath) {

    var sum = 0L

    override fun forEachLine(index: Int, line: String): Boolean {

        // in order l, w, h
        val numbers = ShortArray(3)
        line.split("x")
                .forEachIndexed { i, num ->
                    numbers[i] = num.toShort()
                }

        val perminter = arrayOf(numbers[0] + numbers[0] + numbers[1] + numbers[1],
                numbers[1] + numbers[1] + numbers[2] + numbers[2],
                numbers[2] + numbers[2] + numbers[0] + numbers[0])

        var multiply = 1
        numbers.forEach { multiply *= it }

        sum += multiply + perminter.min()!!

        return false
    }

    override fun displayResult() {
        print("Required ribion $sum")
    }
}