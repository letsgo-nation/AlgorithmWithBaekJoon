import java.util.*;
class Solution {
    public String solution(String X, String Y) {

                // Count frequency of digits in X
        HashMap<Character, Integer> digitCountX = new HashMap<>();
        for (char digit : X.toCharArray()) {
            digitCountX.put(digit, digitCountX.getOrDefault(digit, 0) + 1);
        }

        ArrayList<Character> commonDigits = new ArrayList<>();

        // Find common digits
        for (char digit : Y.toCharArray()) {
            if (digitCountX.containsKey(digit) && digitCountX.get(digit) > 0) {
                commonDigits.add(digit);
                digitCountX.put(digit, digitCountX.get(digit) - 1);
            }
        }

        // If no common digit found, return -1
        if (commonDigits.isEmpty()) {
            return "-1";
        }

        // Sort common digits in descending order
        Collections.sort(commonDigits, Collections.reverseOrder());

        // If common digit is only 0, return 0
        if (commonDigits.size() >= 1 && commonDigits.get(0) == '0') {
            return "0";
        }

        // Construct result string
        StringBuilder sb = new StringBuilder();
        for (char digit : commonDigits) {
            sb.append(digit);
        }

        // Return the result
        return sb.toString();
    }
}