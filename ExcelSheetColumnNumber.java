public class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (char c : columnTitle.toCharArray()) {
            int temp = c - 'A' + 1;
            result = result * 26 + temp;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AA"));
    }
}
