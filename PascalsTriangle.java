import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    int first = lists.get(i - 1).get(j - 1);
                    int second = lists.get(i - 1).get(j);
                    temp.add(first + second);
                }
            }
        }
        return lists;
    }
}
