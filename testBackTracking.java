import java.util.ArrayList;
import java.util.List;

public class testBackTracking {
    public static void main(String[] args) {
        int max = 3;
        int count = 0;
        List<String> list = new ArrayList();
        backtracking(max, new StringBuilder(), list, count);
        System.out.println(list);
    }

    public static void backtracking(int max, StringBuilder str, List<String> list, int count) {
        if (count == max) {
            list.add(str.toString());
            return;
        }

        str.append("H");
        backtracking(max, str, list, count + 1);
        str.delete(str.length() - 1, str.length());
        str.append("T");
        backtracking(max, str, list, count + 1);
        str.delete(str.length() - 1, str.length());

    }
}
