import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.jupiter.api.Test

class MelodyGeneratorTest {

    @Test
    fun `test melody generation with empty input`() {
        val chordsInput = emptyList<String>()
        val melody = generateMelody(chordsInput)
        assertTrue(melody.isEmpty())
    }

    @Test
    fun `test melody generation with valid input`() {
        val chordsInput = listOf("C", "Dm", "G", "Am")
        val melody = generateMelody(chordsInput)
        assertTrue(melody.isNotBlank())
        assertTrue(melody.split(" ").all { it in chordsInput })
    }
    @Test
    fun `test melody length`() {
        val chordsInput = listOf("C", "Dm", "G", "Am")
        val melody = generateMelody(chordsInput)
        val melodyLength = melody.split(" ").size
        assertTrue(melodyLength in 2..10)
    }
}
