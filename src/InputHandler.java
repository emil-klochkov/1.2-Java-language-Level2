import java.util.Scanner;
import java.util.InputMismatchException;

public class InputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid byte.");
                scanner.next(); // Clear the buffer
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid integer.");
                scanner.next();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid float (use a comma instead of a dot).");
                scanner.next();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid double (use a comma instead of a dot).");
                scanner.next();
            }
        }
    }

    public static char readChar(String message) throws CustomException {
        System.out.print(message + " ");
        String input = scanner.next();
        if (input.length() != 1) {
            throw new CustomException("Error: You must enter only one character.");
        }
        return input.charAt(0);
    }

    public static String readString(String message) {
        System.out.print(message + " ");
        return scanner.next();
    }

    public static boolean readYesNo(String message) {
        while (true) {
            System.out.print(message + " (y/n) ");
            String input = scanner.next().toLowerCase();
            if (input.equals("y")) return true;
            if (input.equals("n")) return false;
            System.out.println("Error: Please enter 'y' for yes or 'n' for no.");
        }
    }
}