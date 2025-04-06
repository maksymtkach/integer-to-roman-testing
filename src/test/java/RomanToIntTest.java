import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanToIntTest {

    @Test void testI() { assertEquals(1, RomanConverter.romanToInt("I")); }
    @Test void testIV() { assertEquals(4, RomanConverter.romanToInt("IV")); }
    @Test void testIX() { assertEquals(9, RomanConverter.romanToInt("IX")); }
    @Test void testXII() { assertEquals(12, RomanConverter.romanToInt("XII")); }
    @Test void testXXVII() { assertEquals(27, RomanConverter.romanToInt("XXVII")); }
    @Test void testXL() { assertEquals(40, RomanConverter.romanToInt("XL")); }
    @Test void testXC() { assertEquals(90, RomanConverter.romanToInt("XC")); }
    @Test void testCD() { assertEquals(400, RomanConverter.romanToInt("CD")); }
    @Test void testCM() { assertEquals(900, RomanConverter.romanToInt("CM")); }
    @Test void testM() { assertEquals(1000, RomanConverter.romanToInt("M")); }

    @Test
    void testInvalidCharacters() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            RomanConverter.romanToInt("ABC");
        });
        assertTrue(ex.getMessage().contains("Invalid Roman numeral character"));
    }

    @Test
    void testEmptyInput() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            RomanConverter.romanToInt("");
        });
        assertTrue(ex.getMessage().contains("cannot be null or empty"));
    }

    @Test
    void testNonStandardPattern() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            RomanConverter.romanToInt("IIII");
        });
        assertTrue(ex.getMessage().contains("non-standard Roman numeral"));
    }

    @Test
    void testNullInput() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            RomanConverter.romanToInt(null);
        });
        assertTrue(ex.getMessage().contains("cannot be null or empty"));
    }

    @Test
    void testLowerCaseInput() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            RomanConverter.romanToInt("xii");
        });
        assertTrue(ex.getMessage().contains("Invalid Roman numeral character"));
    }
}
