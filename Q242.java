import java.util.HashMap;
import java.util.Properties;

public class Q242 {
    public static boolean isAnagram(String s, String t){
        int sLen = s.length();
        int tLen = t.length();
        //int count = 0;
        
        if(sLen != tLen){
            return false;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        //HashMap<Char, Integer> pam = new HashMap<>();
        
        for(int i=0; i<sLen; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
            
            // if(!map.contain(s.charAt(i))){
            //     map.add(s.charAt(i), count++);
            // }
        }
        
        for(char i:map.keySet()){
            if(map.get(i) != 0){
                return false;
            }
        }        
        return true;
    }

    public static void main (String [] args){
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
