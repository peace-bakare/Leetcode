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

        int prefLen = pref.length();
        int wordLen = word.length();        

        for(int i=0; i<prefLen; i++){
            if(prefLen > wordLen){
                return false;
            }

            if(word.charAt(i) != pref.charAt(i)){
                return false;
            }            
        }
        return hasPref;
    }

    public static void main (String[]args){
        //["leetcode","win","loops","success"]
        //"code"
        //["kttxeksggb","vucqwew","lyknscc","mryl","vwarnwkfmd","ivawxbntgs","mylw","namybmfy","uosag","rzernqxyn","puf","hfwjnmvm","jjfyd","xteybd","v","ywntwzn","npsogop","brgvlw","vewhi","brk","hheub","zl","vt","bxjtjivep","p","io","xotulskjmt","mctffonh","pmeuqhoe","ghktrtq","u","ngnvwan","pqmlvvhl","enjf","qomcejb","twgqww","bnilyqy","nc","fttlodnz","fya","g","uoivsr","gtxgcaf","qs","gkfl","sdmacxf","mzy","xjv","yipc","rctqugjjk","myij","xxg","vyup","utqxplpsa","imbteaczlc","qfgdcz","atfn","pxcsg","f","omukbiaudb","uh","uobwgt","hgqipk","zunfzinenk","i","p","pet","fxai","ortqpwkukg","rxgh","ylfh"]
        //"ikwjoty"
        //["pay","attention","practice","attend"]
        //"at"
        String [] words = {"kttxeksggb","vucqwew","lyknscc","mryl","vwarnwkfmd","ivawxbntgs","mylw","namybmfy","uosag","rzernqxyn","puf","hfwjnmvm","jjfyd","xteybd","v","ywntwzn","npsogop","brgvlw","vewhi","brk","hheub","zl","vt","bxjtjivep","p","io","xotulskjmt","mctffonh","pmeuqhoe","ghktrtq","u","ngnvwan","pqmlvvhl","enjf","qomcejb","twgqww","bnilyqy","nc","fttlodnz","fya","g","uoivsr","gtxgcaf","qs","gkfl","sdmacxf","mzy","xjv","yipc","rctqugjjk","myij","xxg","vyup","utqxplpsa","imbteaczlc","qfgdcz","atfn","pxcsg","f","omukbiaudb","uh","uobwgt","hgqipk","zunfzinenk","i","p","pet","fxai","ortqpwkukg","rxgh","ylfh"};
        String pref = "ikwjoty";
        System.out.println(prefixCount(words, pref));
    }
 }