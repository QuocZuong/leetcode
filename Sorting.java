import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    public static void sort(String s){
        String[] numberStrings = s.split(", ");
        int[] intArray = new int[numberStrings.length];
        
        for (int i = 0; i < numberStrings.length; i++) {
            intArray[i] = Integer.parseInt(numberStrings[i]);
        }

        Arrays.sort(intArray);

        Collections.reverse(Arrays.asList(intArray));

    }
}
