import java.util.HashMap;
import java.util.Map;

public class WordPattern{
    public static boolean wordPattern(String pattern, String s) {
        
        Map<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");

        if(pattern.length()!=words.length)
        return false;
        
        for(int i = 0; i < pattern.length(); i++){
            if(map.containsValue(words[i]) && map.containsKey(pattern.charAt(i)) == false){
                return false;
            }
            if(map.containsKey(pattern.charAt(i)) == false){
                map.put(pattern.charAt(i), words[i]);
            }
            else{
                String str=map.get(pattern.charAt(i));
                if(!str.equals(words[i])) 
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }
}