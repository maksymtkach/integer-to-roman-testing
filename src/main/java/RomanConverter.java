import java.util.HashMap;
import java.util.Map;

public class RomanConverter {
    private static final int[] VALUES =
            {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS =
            {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < VALUES.length; i++) {
            while (num >= VALUES[i]) {
                num -= VALUES[i];
                result.append(SYMBOLS[i]);
            }
        }
        return result.toString();
    }

    public static int romanToInt(String roman) {
        if (roman == null || roman.isEmpty())
            throw new IllegalArgumentException("Roman numeral cannot be null or empty.");

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1); map.put('V', 5); map.put('X', 10);
        map.put('L', 50); map.put('C', 100);
        map.put('D', 500); map.put('M', 1000);

        int sum = 0;
        int prev = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char c = roman.charAt(i);
            Integer current = map.get(c);

            if (current == null)
                throw new IllegalArgumentException("Invalid Roman numeral character: " + c);

            if (current < prev) {
                sum -= current;
            } else {
                sum += current;
            }

            prev = current;
        }

        String reconverted = intToRoman(sum);
        if (!reconverted.equals(roman))
            throw new IllegalArgumentException("Invalid or non-standard Roman numeral format: " + roman);

        return sum;
    }
}
