import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        callback(n, 0, "", result);
        return result;
    }

    public void callback(int left, int right, String res, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(res);
            return;
        }

        if (left > 0) {
            callback(left - 1, right + 1, res + "(", result);
        }

        if (right > 0) {
            callback(left, right - 1, res + ")", result);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses gp = new GenerateParentheses();
        List<String> result = gp.generateParenthesis(3);
        System.out.println(result);
    }
}
