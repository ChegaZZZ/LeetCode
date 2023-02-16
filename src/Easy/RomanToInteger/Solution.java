package Easy.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(romanToInt("MDCXCV"));
    }

    private static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        int value;
        int nextValue;
        int result = 0;

        String[] symbols = s.split("");

        for (int i = 0; i < symbols.length; i++) {
            if (i == symbols.length - 1) {
                return result + map.get(symbols[i]);
            }

            value = map.get(symbols[i]);
            nextValue = map.get(symbols[i + 1]);

            if (value < nextValue) {
                result += nextValue - value;
                i++;
            } else {
                result += value;
            }
        }
        return result;
    }
}