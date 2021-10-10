package ru.dataart.academy.java;

import org.junit.jupiter.api.Test;

public class LongestSubstringTest {

    @Test
    void test() {
        LongestSubstring longestSubstring = new LongestSubstring();
        assert(longestSubstring.getLengthOfLongestSubstring("") == 0);
        assert(longestSubstring.getLengthOfLongestSubstring("a") == 1);
        assert(longestSubstring.getLengthOfLongestSubstring("aa") == 1);
        assert(longestSubstring.getLengthOfLongestSubstring("bbbb") == 1);
        assert(longestSubstring.getLengthOfLongestSubstring("abcabcbb") == 3);
        assert(longestSubstring.getLengthOfLongestSubstring("pwwkew") == 3);
        assert(longestSubstring.getLengthOfLongestSubstring("babad") == 3);
        assert(longestSubstring.getLengthOfLongestSubstring("wkewl") == 4);
        assert(longestSubstring.getLengthOfLongestSubstring("pww") == 2);
        assert(longestSubstring.getLengthOfLongestSubstring("eabcb") == 4);
        assert(longestSubstring.getLengthOfLongestSubstring("abba") == 2);
    }
}
