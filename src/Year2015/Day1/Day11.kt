package Year2015.Day1

import java.io.FileReader


object Day11 {

    val path = "C:\\Users\\its me\\IdeaProjects\\AdventsOfCode\\src\\Year2015\\Day1\\Day1.txt"

    @JvmStatic
    fun main(x: Array<String>) {

        var steps = 0

        val fileReader = FileReader(path)
        var i: Int = fileReader.read()
        while (i != -1) {
            steps = calculateStep(steps, i.toChar())
            i = fileReader.read()
        }

        print("Number of steps is $steps")
        fileReader.close()
    }

    private fun calculateStep(steps: Int, i: Char): Int {
        return if (i == '(') steps + 1
        else steps - 1
    }
}