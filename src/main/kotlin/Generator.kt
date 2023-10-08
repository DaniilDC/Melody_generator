//Главная функция программы
fun main() {
    println("Введите аккорды через пробел (например, C Dm G Am):")
    val chordsInput = readLine()?.split(" ")

    if (!chordsInput.isNullOrEmpty()) {
        val melody = generateMelody(chordsInput)
        println("Сгенерированная мелодия:")
        println(melody)
    } else {
        println("Вы не ввели аккорды. Пожалуйста, попробуйте снова.")
    }
}
//функция составления мелодии
fun generateMelody(chords: List<String>): String {
    val melodyLength = (2..10).random()
    val melody = StringBuilder()
    if (chords.isEmpty()) {
        return ""
    }
    repeat(melodyLength) {
        val randomChord = chords.random()
        melody.append("$randomChord ")
    }
    return melody.toString().trim()
}
