package lab3107;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Manisha";

        // LinkedHashMap maintains insertion order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        
        // Count frequency of each character
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with count 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }

	}



