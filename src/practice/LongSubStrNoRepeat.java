package src.practice;

public class LongSubStrNoRepeat {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        LongSubStrNoRepeat longSubStrNoRepeat = new LongSubStrNoRepeat();
        System.out.println(longSubStrNoRepeat.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(longSubStrNoRepeat.lengthOfLongestSubstring("bbbbb")); // 1
        System.out.println(longSubStrNoRepeat.lengthOfLongestSubstring("pwwkew")); // 3
        System.out.println(longSubStrNoRepeat.lengthOfLongestSubstring("")); // 0
    }
}
