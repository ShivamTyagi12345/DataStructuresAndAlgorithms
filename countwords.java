import java.util.Arrays;
import java.util.HashSet;

public class countwords {
   
        public static int wordCount (String[] startWords, String[] targetWords) {
            HashSet<String> set = new HashSet<>();
            int count=0;
           
            for(String startWord:startWords) {
               char[] wordChars = startWord.toCharArray();
               Arrays.sort(wordChars);
               set.add(new String(wordChars));
           }
            
            for(String word:targetWords){
                for(int i=0;i<word.length();i++){
                   String modifiedWord= word.substring(0,i)+word.substring(i+1,word.length());
                   char[] wordChars = modifiedWord.toCharArray(); 
                    Arrays.sort(wordChars);
                    if(set.contains(new String(wordChars))){
                        count++;
                        break;
                    }
                }   
            }
            
            return count;
    }
    public static void main(String[] args) {
        String []startWords={"ant","act","tack"};
        String []targetWords={"tack","act","acti"};
        System.out.println(wordCount(startWords, targetWords));
    }

}
