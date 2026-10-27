class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int n = s.length();
        int countA = 0;
        int countB = 0;

        // Traverse through the string and count vowels in both halves
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            // Check if the character is a vowel
            if (vowels.indexOf(c) != -1) {
                if (i < n / 2) {
                    countA++; // First half
                } else {
                    countB++; // Second half
                }
            }
        }

        return countA == countB;
    }
}