import java.util.*;

class FirstNonRepeatingCharacter {


    public int firstNonRepeatingCharacter(String string) {
        // add all the characters to a hashmap
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < string.length(); i++) {
            if (map.containsKey(string.charAt(i))) {
                map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
            } else {
                map.put(string.charAt(i), 1);
            }
        }
        // find the first character that is not repeated
        for (int i = 0; i < string.length(); i++) {
            if (map.get(string.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
