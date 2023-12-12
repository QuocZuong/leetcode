public class another {
    public static void main(String[] args) {
        String prefix = "hi";
        String input = "hiha";

        if (input.indexOf(prefix) == 0) {
            System.out.println("prefix");
        }

        // check postfix
        if (input.endsWith(prefix)) {
            System.out.println("postfix");
        }
    }
}