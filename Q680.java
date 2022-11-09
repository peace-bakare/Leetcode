/*
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 * 
 * Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false
 */

public class Q680 {
    public static void main (String[]args){
        String s = "bladadlb";
        String s1 = "abca";
        String s2 = "abc";
        System.out.println(validPalindrome(s));
        System.out.println(validPalindrome(s1));
        System.out.println(validPalindrome(s2));
    }
    
    public static boolean validPalindrome(String s){
        //boolean valid = true;
        int l = 0;
        int m = s.length() - 1;

        while(l < m){
            if(s.charAt(l) != s.charAt(m)){
                return (checkPalindrome(s, l, m - 1) || checkPalindrome(s, l + 1, m));
            }
            l++;
            m--;
        }

        return true;
    }

    public static boolean checkPalindrome(String a, int i, int j){        
        while (i < j){
            if(a.charAt(i) != a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
