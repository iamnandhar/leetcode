package src.Basics;

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
        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c);
            if (index == -1) {
                return false;
            }
            magazine = magazine.substring(0, index) + magazine.substring(index + 1);
        }
        return true;
    }
}
