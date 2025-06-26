package krankenkasse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PatientVerwaltung patienten = new PatientVerwaltung();
        BeraterVerwaltung berater = new BeraterVerwaltung();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            clearConsole();
            printMenu();
            System.out.print("Bitte wählen Sie eine Option (0 bis 9): ");
            String eingabe = scanner.nextLine().trim();

            switch (eingabe) {
                case "1" -> patienten.patientHinzufuegen(null);
                case "2" -> patienten.patientenAnzeigen();
                case "3" -> patienten.patientenAnzeigen();
                case "4" -> patienten.patientLoeschenNachID();
                case "5" -> berater.beraterHinzufuegen(null);
                case "6" -> berater.beraterAnzeigen();
                case "7" -> berater.beraterSuchenUndAnzeigen();
                case "8" -> berater.beraterLoeschen();
                case "9" -> berater.beraterZuweisen(patienten);
                case "0" -> running = false;
                default -> System.out.println("⚠️ Ungültige Eingabe. Bitte eine Zahl von 0 bis 9 eingeben.");
            }

            if (!eingabe.equals("0")) {
                System.out.print("\n⏎ Drücken Sie Enter, um fortzufahren...");
                scanner.nextLine();
            }
        }

        scanner.close();
        System.out.println("\n !!! Programm beendet.");
    }

    private static void printMenu() {
        System.out.println("""
                ========================================
                 K R A N K E N K A S S E   M E N Ü
                ========================================
                1.  Patient hinzufügen
                2.  Patienten anzeigen
                3.  Patient aufrufen
                4.  Patient löschen
                5.  Berater hinzufügen
                6.  Berater anzeigen
                7.  Berater aufrufen
                8.  Berater löschen
                    ========================================
                9.  Berater zuweisen
                    ========================================
                0.  Beenden
                """);
    }

    // Versuch, das Terminal zu "leeren" (funktioniert nicht in allen IDEs)
    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
