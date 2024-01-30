fun main(args: Array<String>) {
    println("Привет! Давай сыграем в игру, хе-хе (угрожающе)")

    val wordlist = listOf("солома", "скутер", "панама", "спираль", "молоко")
    val secret = wordlist.random()
    var clues = ("ауоыиэяюеё")
    var turns = 5

    while (turns > 0) {
        var missed = 0
        for (letter in secret) {
            if (letter in clues) {
                println("$letter ")
            } else {
                println("_" + " ")
                missed += 1
            }
        }
        if (missed == 0) {
            println("Ты победил! Как тебе удалось?!")
            break
        }
        val guess = readln()
        clues += guess

        if (guess !in secret) {
            turns -= 1
            println("Не угадал, мухаха! $guess?! О чём ты только думал?!")
            println("Осталось попыток: $turns")
            if (turns == 4) {
                println("  |  ")
            }
            if (turns < 4) {
                println("  O  ")
            }
            if (turns < 3) {
                println(" /|  ")
            }
            if (turns < 2) {
                println("  |  ")
            }
            if (turns < 1) {
                println(" //  ")
            }
            if (turns == 0) {
                println("Я загадал слово $secret, но тебе, вижу, уже без разницы >:)")
            }
            println("Program arguments: ${args.joinToString()}")
        } else {
            println("$guess, да? Неплохо-неплохо, но у меня ещё есть шанс отыграться!")
        }
    }
}
