/*
 * Implement the function that builds a sequence of 
 * Fibonacci numbers using 'sequence' function. Use 'yield'.
 */

 /*
 * fun fibonacci(): Sequence<Int> = sequence {
 *     TODO()
 * }
 * 
 * fun main(args: Array<String>) {
 *     fibonacci().take(4).toList().toString() eq
 *             "[0, 1, 1, 2]"
 * 
 *     fibonacci().take(10).toList().toString() eq
 *             "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"
 * }
 * 
 * infix fun <T> T.eq(other: T) {
 *     if (this == other) println("OK")
 *     else println("Error: $this != $other")
 * }
 * 
 */

fun fibonacci(): Sequence<Int> = sequence {
    var elements = Pair(0, 1)

    while (true) {
        yield(elements.first)
        elements = Pair(elements.second, elements.first + elements.second)
    }
}

fun main(args: Array<String>) {
    fibonacci().take(4).toList().toString() eq
            "[0, 1, 1, 2]"

    fibonacci().take(10).toList().toString() eq
            "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"
}

infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}
