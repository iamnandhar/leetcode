package test.practice;

import src.practice.LongSubStrNoRepeat;

import static org.junit.jupiter.api.Assertions.*;

class LongSubStrNoRepeatTest {

        @org.junit.jupiter.api.Test
        void lengthOfLongestSubstring() {
            LongSubStrNoRepeat longSubStrNoRepeat = new LongSubStrNoRepeat();
            assertEquals(3, longSubStrNoRepeat.lengthOfLongestSubstring("abcabcbb"));
            assertEquals(1, longSubStrNoRepeat.lengthOfLongestSubstring("bbbbb"));
            assertEquals(3, longSubStrNoRepeat.lengthOfLongestSubstring("pwwkew"));
            assertEquals(0, longSubStrNoRepeat.lengthOfLongestSubstring(""));
        }

}