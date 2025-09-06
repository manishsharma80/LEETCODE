import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int item : nums) {
            if (hm.containsKey(item)) {
                hm.put(item, hm.get(item) + 1);
            } else {
                hm.put(item, 1);
            }
        }
        
        int maxFreq = 0;
        int result = -1;
        
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                result = entry.getKey();
            }
        }
        
        return result;
    }
}
