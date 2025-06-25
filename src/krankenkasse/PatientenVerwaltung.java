package krankenkasse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PatientenVerwaltung {
    private List<Patient> patientenListe = new ArrayList<>();

    public void patientHinzufuegen(Patient patient) {
        patientenListe.add(patient);
        System.out.println("Patient hinzugefügt: " + patient.getName());
    }

    public void patientenSpeichernAlsJSON() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("patienten.json")) {
            gson.toJson(patientenListe, writer);
            System.out.println("Patientenliste wurde in patienten.json gespeichert.");
        } catch (IOException e) {
            System.out.println("Fehler beim Speichern: " + e.getMessage());
        }
    }
}





