package Homework5;
import java.util.HashMap;

/* Task 2085. Count Common Words With One Occurrence
 * https://leetcode.com/problems/count-common-words-with-one-occurrence/description/
 */

public class LeetCode2085 {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        int n1 = words1.length;
        int n2 = words2.length;

        for (int i=0; i<n1; i++) {
            if (!map.containsKey(words1[i])) {
                map.put(words1[i], 1);
            }
            else {
                map.put(words1[i], map.get(words1[i]) + 1);
            }
        }

        for (int i=0; i<n2; i++) {
            if (!map1.containsKey(words2[i])) {
                map1.put(words2[i], 1);
            }
            else {
                map1.put(words2[i], map1.get(words2[i]) + 1);
            }
        }

        for (int i=0; i<n1; i++) {
            if (map.get(words1[i]) == map1.get(words1[i]) && map1.get(words1[i]) == 1) {
                count++;
            }
        }

        return count;
    }
}
