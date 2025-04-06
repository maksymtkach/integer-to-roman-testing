import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanConverterTest {

    @Test void test1() { assertEquals("I", RomanConverter.intToRoman(1)); }
    @Test void test2() { assertEquals("II", RomanConverter.intToRoman(2)); }
    @Test void test3() { assertEquals("III", RomanConverter.intToRoman(3)); }
    @Test void test4() { assertEquals("IV", RomanConverter.intToRoman(4)); }
    @Test void test5() { assertEquals("V", RomanConverter.intToRoman(5)); }
    @Test void test6() { assertEquals("VI", RomanConverter.intToRoman(6)); }
    @Test void test7() { assertEquals("VII", RomanConverter.intToRoman(7)); }
    @Test void test8() { assertEquals("VIII", RomanConverter.intToRoman(8)); }
    @Test void test9() { assertEquals("IX", RomanConverter.intToRoman(9)); }
    @Test void test10() { assertEquals("X", RomanConverter.intToRoman(10)); }

    @Test void test11() { assertEquals("XI", RomanConverter.intToRoman(11)); }
    @Test void test12() { assertEquals("XII", RomanConverter.intToRoman(12)); }
    @Test void test13() { assertEquals("XIV", RomanConverter.intToRoman(14)); }
    @Test void test14() { assertEquals("XV", RomanConverter.intToRoman(15)); }
    @Test void test15() { assertEquals("XIX", RomanConverter.intToRoman(19)); }
    @Test void test16() { assertEquals("XX", RomanConverter.intToRoman(20)); }
    @Test void test17() { assertEquals("XXVII", RomanConverter.intToRoman(27)); }
    @Test void test18() { assertEquals("XL", RomanConverter.intToRoman(40)); }
    @Test void test19() { assertEquals("L", RomanConverter.intToRoman(50)); }
    @Test void test20() { assertEquals("XC", RomanConverter.intToRoman(90)); }

    @Test void test21() { assertEquals("C", RomanConverter.intToRoman(100)); }
    @Test void test22() { assertEquals("CD", RomanConverter.intToRoman(400)); }
    @Test void test23() { assertEquals("D", RomanConverter.intToRoman(500)); }
    @Test void test24() { assertEquals("CM", RomanConverter.intToRoman(900)); }
    @Test void test25() { assertEquals("M", RomanConverter.intToRoman(1000)); }
}

