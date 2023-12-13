public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
       
        int[] storage1 = new int[200];
        int[] storage2 = new int[200];

        for(int i = 0; i < t.length(); i++){
            if(storage1[s.charAt(i)] != storage2[t.charAt(i)]) return false;

            storage1[s.charAt(i)] = i + 1;
            storage2[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";

        System.out.println(isIsomorphic(s, t));
    }
}
