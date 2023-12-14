
public class RansomNote{
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[128];

        for(char c: magazine.toCharArray()){
            count[c]++;
        }
        for(char c: ransomNote.toCharArray()){
            if(count[c]-- <= 0){
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";

        System.out.println(canConstruct(ransomNote, magazine));
    }
}