class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths are different, not an anagram
        if (s.length() != t.length()) {
            return false;
        }

        // Frequency array for 26 lowercase letters
        int[] count = new int[26];

        // Count each character in 's' and subtract for each in 't'
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // If all counts are zero, it's an anagram
        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}
