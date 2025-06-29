package krankenkasse;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class PatientVerwaltung {
    private List<Patient> patientenListe = new ArrayList<>();

    public PatientVerwaltung() {
        patientenListe = ladePatienten();
    }

    private List<Patient> ladePatienten() {
        try (Reader reader = new FileReader("patienten.json")) {
            Type type = new TypeToken<List<Patient>>() {}.getType();
            return new Gson().fromJson(reader, type);
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }
    

    public void patientenSpeichernAlsJSON() {
        try (Writer writer = new FileWriter("patienten.json")) {
            new GsonBuilder().setPrettyPrinting().create().toJson(patientenListe, writer);
        } catch (IOException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }

    
        // In PatientenVerwaltung.java ergänzen
    public Patient patientSuchenNachMerkmal(String wert, String merkmalTyp) {
        for (Patient p : patientenListe) {
            if (merkmalTyp.equalsIgnoreCase("id") && p.getId().equals(wert)) {
                return p;
            } else if (merkmalTyp.equalsIgnoreCase("name") && p.getName().equalsIgnoreCase(wert)) {
                return p;
            }
        }
        System.out.println("Kein Patient mit " + wert + " = " + merkmalTyp + " gefunden.");
        return null;
    }


 
    public void patientHinzufuegen(Patient patient) {
        if (patient == null) {
            String id = ScannerUtils.getString("ID des Patienten: ");
            String name = ScannerUtils.getString("Name des Patienten: ");
            int alter = ScannerUtils.getInt("Alter des Patienten: ");
            String geschlecht = ScannerUtils.getString("Geschlecht des Patienten: ");
            String versichertennummer = ScannerUtils.getString("Versichertennummer des Patienten: ");
            // Optional: Zuweisung eines Beraters
            String zugewiesenerBerater = ScannerUtils.getString("Zugewiesenerberater: ");
            
            patient = new Patient(id, name, alter, geschlecht, versichertennummer, zugewiesenerBerater);
        }
        patientenListe.add(patient);
        patientenSpeichernAlsJSON();
        System.out.println("Patient " + patient.getName() + " wurde hinzugefügt.");
    }

    public void patientSuchen() {
    String merkmal = ScannerUtils.getString("Nach welchem Namen oder ID suchen?");
    String merkmalTyp = merkmal.matches("\\d+") ? "id" : "name";
    Patient p = patientSuchenNachMerkmal(merkmal, merkmalTyp);
    
    if (p != null) {
        System.out.println("Gefundener Patient:\n" + p);
    } else {
        System.out.println("❌ Kein Patient gefunden.");
    }
}


    public void patientenAnzeigen() {
        for (Patient p : patientenListe) {
            System.out.println(p.getName() + ", Alter: " + p.getAlter() + ", Berater: " + p.getZugewiesenerBerater());
        }
    }
    public void patientLoeschenNachID() {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Bitte geben Sie die ID des zu löschenden Patienten ein: ");
        String eingabe = scanner.nextLine();
        
        boolean gefunden = false;
        
        for (Iterator<Patient> iterator = patientenListe.iterator(); iterator.hasNext();) {
            Patient p = iterator.next();
            
            if (p.getId().equalsIgnoreCase(eingabe)) {
                iterator.remove();
                System.out.println("Patient mit ID " + p.getId() + " wurde gelöscht.");
                patientenSpeichernAlsJSON();
                gefunden = true;
                break;
            }
        }
        
        if (!gefunden) {
            System.out.println("Kein Patient mit der ID " + eingabe + " gefunden.");
        }
    }
}


    

    public List<Patient> getPatientenListe() {
        return patientenListe;
    }

    public void setPatientenListe(List<Patient> patientenListe) {
        this.patientenListe = patientenListe;
        patientenSpeichernAlsJSON();
    }
}










