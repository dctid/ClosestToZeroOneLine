import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClosestToZeroTest {

    @Test
    void testTheThing() {
        assertEquals( 3, ClosestToZero.find(List.of(100, 5, 10, 3, 11)));
        assertEquals( 3, ClosestToZero.find(List.of(100, 5, 10, -3, 3, 11)));
        assertEquals( -3, ClosestToZero.find(List.of(100, 5, 10, -3, 11)));
        assertEquals( 100, ClosestToZero.find(List.of(100)));
        assertThrows(IllegalArgumentException.class, () -> ClosestToZero.find(List.of()));
    }
}
