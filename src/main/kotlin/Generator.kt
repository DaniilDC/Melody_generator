fun main() {
    println("Введите аккорды через пробел (например, C Dm G Am):")
    val chordsInput = readLine()?.split(" ")

    if (chordsInput != null && chordsInput.isNotEmpty()) {
//        val melody = generateMelody(chordsInput)
        println("Сгенерированная мелодия:")
//        println(melody)
    } else {
        println("Вы не ввели аккорды. Пожалуйста, попробуйте снова.")
    }
}