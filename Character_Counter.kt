fun main() {
    val string = "Count all \"e\"\'s in this sentence"
    var counter = 0
    for (char in string) {
        if (char == 'e') {
            counter++
        }
    }
    print(counter)
}
