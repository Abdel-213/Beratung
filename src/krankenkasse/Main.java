package krankenkasse;

public class Main {
    public static void main(String[] args) {
        PatientenVerwaltung verwaltung = new PatientenVerwaltung();

        // Mehrfach Patienten eingeben
        while (true) {
            Patient patient = new Patient(
                ScannerUtils.getString("Name des Patienten: "),
                ScannerUtils.getInt("Alter des Patienten: "),
                ScannerUtils.getString("Geschlecht des Patienten (männlich/weiblich/divers): "),
                ScannerUtils.getString("Versichertennummer des Patienten: ")
            );

            verwaltung.patientHinzufuegen(patient);

            String nochmal = ScannerUtils.getString("Weiteren Patienten eingeben? (ja/nein): ");
            if (nochmal.equalsIgnoreCase("nein")) {
                break;
            }
        }

        // Alles speichern
        verwaltung.patientenSpeichernAlsJSON();

        System.out.println("Programm beendet.");
    }
}


