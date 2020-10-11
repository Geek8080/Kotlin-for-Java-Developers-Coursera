/**
 * Implement the property 'foo' so that it produced a 
 * different value on each access. Note that you can modify the 
 * code outside the 'foo' getter (e.g. add additional imports or properties).
 */

/**
 * val foo: Int
 *     get() = TODO()
 * 
 * fun main(args: Array<String>) {
 *     // The values should be different:
 *     println(foo)
 *     println(foo)
 *     println(foo)
 * }
 * 
 */

var count: Int = 1

val foo: Int
    get() = count++

fun main(args: Array<String>) {
    // The values should be different:
    println(foo)
    println(foo)
    println(foo)
}
