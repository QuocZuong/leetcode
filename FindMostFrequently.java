import java.util.HashMap;
import java.util.Map;

public class FindMostFrequently {
    public static int find(String s){
        String[] numberStrings = s.split(", ");
        int[] intArray = new int[numberStrings.length];
        
        for (int i = 0; i < numberStrings.length; i++) {
            intArray[i] = Integer.parseInt(numberStrings[i]);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < intArray.length; i++) {
            if(map.containsKey(intArray[i])){
                map.put(intArray[i], map.get(intArray[i]) + 1);
            }
            else{
                map.put(intArray[i], 1);
            }
        }
        int result = 0;
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "100, 40, 75, 75, 20, 100, 75, 50, 30, 1, 55, 75, 25, 50, 90, 80, 65, 25, 45, 100";
        System.out.println(find(s));
    }
}
