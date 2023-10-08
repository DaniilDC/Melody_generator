fun main() {
    println("Введите аккорды через пробел (например, C Dm G Am):")
    val chordsInput = readLine()?.split(" ")

    if (chordsInput != null && chordsInput.isNotEmpty()) {
        val melody = generateMelody(chordsInput)
        println("Сгенерированная мелодия:")
        println(melody)
    } else {
        println("Вы не ввели аккорды. Пожалуйста, попробуйте снова.")
    }
}

fun generateMelody(chords: List<String>): String {
    val melodyLength = (2..10).random() // случайная длина мелодии от 2 до 10 аккордов
    val melody = StringBuilder()

    repeat(melodyLength) {
        val randomChord = chords.random()
        melody.append("$randomChord ")
    }
    return melody.toString().trim()
}