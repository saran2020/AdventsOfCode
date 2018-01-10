package Year2015.Day1

import Solver

class Day12(filePath: String) : Solver(filePath) {

    var steps = 0
    var pos = 1

    override fun forEachChar(index: Int, char: Char): Boolean {

        if (char == '(') steps++
        else steps--

        // if
        return if (steps == -1) {
            pos = index
            true
        } else {
            false
        }
    }

    override fun displayResult() {
        print("First time entered basement at $pos")
    }
}