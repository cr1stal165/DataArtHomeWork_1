package ru.dataart.academy.java;

import java.util.*;

public class LongestSubstring {

    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 3 (dnm)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        String string = "";
        for (int i = 0; i < checkString.length(); i++) {
            TreeSet<Object> visited = new TreeSet<>();
            int n = i;
            do {
                char node = checkString.charAt(n);
                if (visited.contains(node)) {
                    break;
                } else {
                    visited.add(node);
                }
                n++;
            } while(n < checkString.length());
            if (string.length() < n - i) {
                string = checkString.substring(i, n);
            }
        }
        return string.length();
    }
}
