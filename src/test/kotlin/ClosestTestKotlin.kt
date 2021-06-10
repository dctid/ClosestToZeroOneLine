import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

internal class ClosestTestKotlin {
    @Test
    fun `test the thing`() {
        assertEquals(3, listOf(100, 5, 10, 3, 11).findClosestToZero())
        assertEquals(3, listOf(100, 5, 10, -3, 3, 11).findClosestToZero())
        assertEquals(-3, listOf(100, 5, 10, -3, 11).findClosestToZero())
        assertEquals(100, listOf(100).findClosestToZero())
        assertThrows(IllegalArgumentException::class.java) { emptyList<Int>().findClosestToZero() }
    }
}
