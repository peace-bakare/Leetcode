/*
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" 
 * as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.
 */



 /*
 SOLUTION THAT I PROVIDED THAT DIDN'T WORK FOR ALL TEST CASES...
 
  * Set<Character> dash = new HashSet<Character>();
        for(int i=0; i<text.length(); i++){
            dash.add(text.charAt(i));
        }
        StringBuilder strBuild = new StringBuilder();
        int count = dash.size();
        
        int res = textLen / count;
        
        return res;
  */
public class Q1189 {
    public static int maxNumberOfBalloons(String text) {
        int bCount = 0, aCount = 0, lCount = 0, oCount = 0, nCount = 0;

        for (int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'b'){
                bCount++;
            }else if (text.charAt(i) == 'a'){
                aCount++;
            } else if (text.charAt(i) == 'l'){
                lCount++;
            } else if (text.charAt(i) == 'o'){
                oCount++;
            } else if (text.charAt(i) == 'n'){
                nCount++;
            }            
        }

        lCount = lCount / 2;
        oCount = oCount / 2;

        return Math.min(bCount, Math.min(aCount, Math.min(lCount, Math.min(oCount, nCount))));
    }

    public static void main (String [] args){
        String text = "loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));
    }
}
