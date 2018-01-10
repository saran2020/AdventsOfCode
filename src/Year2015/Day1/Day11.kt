package Year2015.Day1

import Solver

class Day11(filePath: String) : Solver(filePath) {

    var steps = 0

    override fun forEachChar(index: Int, char: Char): Boolean {
        steps = calculateStep(steps, char)
        return true
    }

    override fun displayResult() {
        print("Number of steps is $steps")
    }

    private fun calculateStep(steps: Int, i: Char): Int {
        return if (i == '(') steps + 1
        else steps - 1
    }
}