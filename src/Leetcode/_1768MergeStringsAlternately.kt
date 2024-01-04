package Leetcode


fun main(args: Array<String>) {
    println(mergeAlternately(word1 = "45", word2 = "098"))
}


fun mergeAlternately(word1: String, word2: String): String {
    val result = StringBuilder()

    if (word1.length >= word2.length) {
        for (i in word2.indices) {
            result.append("${word1[i]}${word2[i]}")
        }
        result.append(word1.substring(word2.length))
    } else {
        for (i in word1.indices) {
            result.append("${word1[i]}${word2[i]}")
        }
        result.append(word2.substring(word1.length))
    }

    return result.toString()

}
