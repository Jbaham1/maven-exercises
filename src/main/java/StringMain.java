import java.util.Scanner;

public class StringMain {

    private static StringMain StringUtils;

    public static void main(String[] args) {
        System.out.println("Enter a value: ");
        Scanner userInput = new Scanner(System.in);
        String i = userInput.nextLine();
        System.out.println("The value " + i +" is numeric? "+isNumeric(i));
        System.out.println("The value "+ i +" is a string? "+ isAlpha(i));
        String str2 = StringUtils.swapCase(i);
        System.out.println(str2);
    }

//    private static String swapCase(String str) {
//
//    }

    private static boolean isAlpha(String str) {
        // null or empty
        if (str == null || str.length() == 0) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isNumeric(final String str) {

        // null or empty
        if (str == null || str.length() == 0) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;

    }



}
