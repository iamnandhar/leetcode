package src.basics;

public class RansomNote383 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aba";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] charCounts = new int[26];
        for (char c : magazine.toCharArray()) {
            charCounts[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (--charCounts[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}