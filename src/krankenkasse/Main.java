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
                case "3" -> patienten.patientLoeschenNachID();
                case "4" -> berater.beraterHinzufuegen(null);
                case "5" -> berater.beraterAnzeigen(); 
                case "6" -> berater.beraterLoeschen();
                case "7" -> berater.beraterZuweisen(patienten);
                case "8" -> patienten.patientSuchen();
                case "9" -> berater.beraterSuchenUndAnzeigen();
                case "10" -> {
                    Beratungsverwaltung beratung = new Beratungsverwaltung();
                    beratung.neueBeratungHinzufuegen();
                }
                case "0" -> running = false;
                default -> System.out.println("⚠️ Ungültige Eingabe. Bitte eine Zahl von 0 bis 7 eingeben.");
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
                3.  Patient löschen
                4.  Berater hinzufügen
                5.  Berater anzeigen
                6.  Berater löschen
                    ========================================
                7.  Berater zuweisen
                    ========================================
                8.  Patienten suchen
                9.  Berater suchen 
                10. Beratungsprotokoll anzeigen   
                0.  Beenden
                """);
    }

    // Versuch, das Terminal zu "leeren" (funktioniert nicht in allen IDEs)
    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
