package leetcode._796_Rotate_String;

/**
 * (796. Rotate String)[https://leetcode.com/problems/rotate-string/]
 */
public class Solution {
    public boolean rotateString(String A, String B) {
        return (A.length() == B.length() && (A+A).contains(B));
    }
}