public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int length1 = s.length();
        int length2 = t.length();

        if(length1 < 1){
            return true;
        }

        char storage1[] = s.toCharArray();
        char storage2[] = t.toCharArray();
        int i=0, j = 0;

        while(i < length2){
            if(storage1[j] == storage2[i]){
               j++;
            }
            if(j == length1){
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "b";
        String t = "abc";

        System.out.println(isSubsequence(s, t));
    }
}
