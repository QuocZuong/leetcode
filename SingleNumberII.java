import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> storage = new HashMap<>();
        for (int i : nums) {
            if (storage.containsKey(i)) {
                storage.put(i, storage.get(i) + 1);
            } else {
                storage.put(i, 1);
            }

            if (storage.containsKey(i) && storage.get(i) == 3) {
                storage.remove(i);
            }
        }
        return storage.keySet().stream().findFirst().get();
    }

    public static void main(String[] args) {
        int[] num = { 0, 1, 0, 1, 0, 1, 99, 99, 99, 100 };
        System.out.println(singleNumber(num));
    }
}
