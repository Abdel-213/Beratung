package krankenkasse;

import java.util.Scanner;

public class ScannerUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Bitte eine Zahl eingeben:");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // Puffer leeren
        return value;
    }
}


