package leetcode._344_Reverse_String;

/**
 * [344. Reverse String](https://leetcode.com/problems/reverse-string/)
 */
public class Solution {
    public void reverseString(char[] s) {
        reverseStringRecursion(s, 0, s.length - 1);
    }

    private void reverseStringRecursion(char[] s, int i, int j) {
        if (i >= j) {
            return;
        }
        char ch = s[i];
        s[i] = s[j];
        s[j] = ch;
        reverseStringRecursion(s, ++i, --j);
    }

    public void reverseStringIterative(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while(i <= j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}