fun main() {
    fun findLeastCommonDivisor(a: Int, b: Int): Int {
        val larger = if (a > b) a else b
        val maxCommonDivisor = a * b
        var lcm = larger
        while (lcm <= maxCommonDivisor) {
            if (lcm % a == 0 && lcm % b == 0) {
                return lcm
            }
            lcm += larger
        }
        return maxCommonDivisor
    }
    print("Наименьшее общее кратное чисел 5 и 8 это ")
    println(findLeastCommonDivisor(5,8))
}
