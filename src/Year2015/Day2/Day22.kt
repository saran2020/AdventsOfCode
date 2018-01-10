package Year2015.Day2

import java.io.File


object Day22 {

    val path = "C:\\Users\\its me\\IdeaProjects\\AdventsOfCode\\src\\Year2015\\Day2\\Day2.txt"

    @JvmStatic
    fun main(x: Array<String>) {

        var sum = 0L

        val fileBufferReader = File(path).bufferedReader()
        fileBufferReader.forEachLine { line ->

            // in order l, w, h
            val numbers = ShortArray(3)
            line.split("x")
                    .forEachIndexed { index, num ->
                        numbers[index] = num.toShort()
                    }

            val perminter = arrayOf(numbers[0] + numbers[0] + numbers[1] + numbers[1],
                    numbers[1] + numbers[1] + numbers[2] + numbers[2],
                    numbers[2] + numbers[2] + numbers[0] + numbers[0])

            var multiply = 1
            numbers.forEach { multiply *= it }

            sum += multiply + perminter.min()!!
        }

        print("Required ribion $sum")
        fileBufferReader.close()
    }
}