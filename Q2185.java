/*
 * 2185. Counting Words With a Given Prefix
 * 
 * You are given an array of strings words and a string pref.

Return the number of strings in words that contain pref as a prefix.

A prefix of a string s is any leading contiguous substring of s.
 */

 class Q2185 {
    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i=0; i<words.length; i++){
            if(hasPrefix(words[i], pref) == true){
                count++;
            }
        }
        return count;
    }
    
    public static boolean hasPrefix(String word, String pref){
        boolean hasPref = true;

        for(int i=0; i<pref.length(); i++){
            if(word.charAt(i) != pref.charAt(i)){
                return false;
            }            
        }
        return hasPref;
    }

    public static void main (String[]args){
        //["leetcode","win","loops","success"]
        //"code"
        String [] words = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(prefixCount(words, pref));
    }
 }