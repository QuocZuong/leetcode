public class IntegerToRoman {
    public static String intToRoman(int num) {
        String finalResult = "";
        StringBuilder result = new StringBuilder();

        int temp = num;
        while (temp != 0) {

            if (temp >= 1000) {
                result.append("M");
                temp -= 1000;

            } else if (temp >= 900) {
                result.append("CM");
                temp -= 900;
            } else if (temp >= 500) {
                result.append("D");
                temp -= 500;
            } else if (temp >= 400) {
                result.append("CD");
                temp -= 400;
            } else if (temp >= 100) {
                result.append("C");
                temp -= 100;
            } else if (temp >= 90) {
                result.append("XC");
                temp -= 90;
            } else if (temp >= 50) {
                result.append("L");
                temp -= 50;
            } else if (temp >= 40) {
                result.append("XL");
                temp -= 40;
            } else if (temp >= 10) {
                result.append("X");
                temp -= 10;
            } else if (temp >= 9) {
                result.append("IX");
                temp -= 9;
            } else if (temp >= 5) {
                result.append("V");
                temp -= 5;
            } else if (temp >= 4) {
                result.append("IV");
                temp -= 4;
            } else if (temp < 5) {
                result.append("I");
                temp -= 1;
            }

        }

        finalResult = result.toString();
        return finalResult;
    }

    public static void main(String[] args) {
        int num = 1994;
        System.out.println(intToRoman(num));
    }
}
