package krankenkasse;

import java.util.Scanner;

public class Beratungsverwaltung {
    public void neueBeratungHinzufuegen() {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Patientenname: ");
        String patient = scanner.nextLine();

        System.out.print("Beratername: ");
        String berater = scanner.nextLine();

        System.out.print("Datum (z.B. 2025-07-02): ");
        String datum = scanner.nextLine();

        System.out.print("Uhrzeit (z.B. 14:30): ");
        String uhrzeit = scanner.nextLine();

        System.out.print("Dauer (z.B. 45 Minuten): ");
        String dauer = scanner.nextLine();

        System.out.print("Thema der Beratung: ");
        String thema = scanner.nextLine();

        System.out.print("Notizen: ");
        String notizen = scanner.nextLine();

        Beratungsprotokoll protokoll = new Beratungsprotokoll(patient, berater, datum, uhrzeit, dauer, thema, notizen);
        
        // Jetzt speichern
        speichereBeratungInDatei(protokoll);
    }
}

    private void speichereBeratungInDatei(Beratungsprotokoll protokoll) {
        Speichern.speichereBeratungInDatei(protokoll);
        System.out.println("Beratung erfolgreich gespeichert.");
    }

}
