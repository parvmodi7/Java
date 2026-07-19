package Queue;
import java.util.*;

public class firstuniquech {
    public static void main(String args[]) {

        String s = "loveleetcode";

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        boolean found = false;

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(-1);
        }
    }
}