package org.example
fun main(args: Array<String>) {
    while (true) {
        println("\nПривет! Давай сыграем в игру, хе-хе (угрожающе)")
        println("1 - Играем в виселицу")
        println("2 - Играем в месть боксёра")
        println("3 - Выход")
        print("Введи свой выбор сюда > ")
        val input = readln()
        when (input) {
            "1" -> hangmanGame()
            "2" -> println("\nТакая игра будет позже")
            "3" -> break;
            else -> println("\nТакого варианта нет, давай по новой")
        }
    }
}
private fun hangmanGame() {
    val wordlist = listOf("солома", "скутер", "панама", "спираль", "молоко")
    val secret = wordlist.random()
    val positiveResponseList = listOf("\nЯ и правда загадал слово \"$secret\". Ты победил! Как тебе удалось?!", "\nДа, \"$secret\"! Мне нравится этот парень – он опять выиграл!", "\nУдивительно, но это и правда \"$secret\". Ты сегодня в ударе!")
    val win = positiveResponseList.random()
    val clues = ("ауоыиэяюеё").toSet().toMutableSet()
    var turns = 5
    while (turns > 0) {
        var missed = 0
        for (letter in secret) {
            if (letter in clues) {
                print("$letter ")
            } else {
                print("_ ")
                missed += 1
            }
        }
        println();
        if (missed == 0) {
            println(win)
            break
        }
        var guess: Char = Char.MIN_VALUE
        do {
            if (guess != Char.MIN_VALUE)
                println("Такая буква уже была")
            print("Введи свою догадку сюда > ")
            val rawGuess = readln()
            val guessConfirmed = if (rawGuess.isNotEmpty()) {
                guess = rawGuess.first()
                clues.add(guess)
            } else {
                false
            }
        } while (!guessConfirmed)
        if (guess !in secret) {
            turns -= 1
            println("Не угадал, мухаха! \"$guess\"?! О чём ты только думал?!")
            println("Осталось попыток: \"$turns\"")
            if (turns < 5) {
                println("Прогресс виселицы:\n‾‾|  ")
            }
            if (turns < 4) {
                println("  O  ")
            }
            if (turns < 3) {
                println(" /|\\  ")
            }
            if (turns < 2) {
                println("  |  ")
            }
            if (turns < 1) {
                println(" / \\  ")
            }
            if (turns == 0) {
                println("\nЯ загадал слово \"$secret\", но тебе, вижу, уже без разницы >:)")
            }
        } else {
            println("\"$guess\", да? Неплохо-неплохо, но у меня ещё есть шанс отыграться!")
        }
    }
}
