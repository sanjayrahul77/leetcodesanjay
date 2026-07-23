class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) //To check length
        {
            return false;
        }

        int count[] = new int[26]; //To create frequenc array

        for (int i = 0; i < s.length(); i++) { // To count character from first string
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) { // To reduce character using second string
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;

    }

}
