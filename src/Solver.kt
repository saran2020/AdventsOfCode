import java.io.BufferedReader
import java.io.File
import java.io.FileReader


abstract class Solver(val filePath: String) {

    var lineIndex = 0

    fun solve() {
        val file = File(filePath)

        BufferedReader(FileReader(file)).use { br ->

            var line = br.readLine()
            loop@ while (line != null) {

                val charArray = line.toCharArray()

                for (charIndex in 0 until charArray.size) {

                    if (forEachChar(charIndex + 1, charArray[charIndex])) break@loop
                }

                if (forEachLine(lineIndex, line)) break@loop

                line = br.readLine()
                lineIndex++
            }
        }

        displayResult()
    }

    /**
     * If the function returns true will stop the read operation
     */
    protected open fun forEachChar(index: Int, char: Char): Boolean {
        return false
    }

    /**
     * If the function returns true it will stop the read operation
     */
    protected open fun forEachLine(index: Int, line: String): Boolean {
        return false
    }

    protected abstract fun displayResult()
}