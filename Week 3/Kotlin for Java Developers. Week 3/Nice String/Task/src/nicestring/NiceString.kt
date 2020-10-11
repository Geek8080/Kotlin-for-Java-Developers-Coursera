package nicestring

fun String.isNice(): Boolean {
    val case1: Boolean = !contains("bu|ba|be".toRegex())
    val case2: Boolean = filter { it in setOf('a', 'e', 'i', 'o', 'u') }.length >= 3
    val case3: Boolean = contains("""(.)\1""".toRegex())

    return (case1 && case2) || (case1 && case3) || (case2 && case3)
}

fun main(){
    val string: String = "ynzz"

    println(string.isNice().toString())
}