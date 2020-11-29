package leetcode._28_Implement_strStr;

/**
 * [28. Implement strStr()](https://leetcode.com/problems/implement-strstr/)
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if(needle.length() == 0) {
            return 0;
        }

        char first = needle.charAt(0);
        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() > haystack.length()) {
                return -1;
            }
            if (haystack.charAt(i) == first) {
                int j = i;
                boolean isResult = false;
                for (int k = 0; k < needle.length(); k++) {
                    if (i+k < haystack.length()) {
                        isResult = needle.charAt(k) == haystack.charAt(i+k);
                        if (!isResult) break;
                    }
                }
                if(isResult) return j;
            }
        }
        return -1;
    }
}