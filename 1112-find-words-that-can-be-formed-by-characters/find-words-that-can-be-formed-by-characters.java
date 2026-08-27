class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for (char c : chars.toCharArray()) {
            freq[c - 'a']++;
        }
        int res = 0;
        for (String word : words) {
            int[] temp = freq.clone();
            boolean possible = true;
            for (char c : word.toCharArray()) {
                if (temp[c - 'a'] == 0) {
                    possible = false;
                    break;
                }
                temp[c - 'a']--;
            }
            if (possible) {
                res += word.length();
            }
        }
        return res;
    }
}