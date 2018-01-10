import java.util.*
import jdk.nashorn.internal.runtime.ScriptingFunctions.readLine
import java.io.FileReader
import java.io.BufferedReader
import java.io.File


abstract class Solver(filePath: String) {

    var lineIndex = 0


    init {
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