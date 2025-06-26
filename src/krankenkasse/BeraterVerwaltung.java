package krankenkasse;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class BeraterVerwaltung {
    private List<Berater> beraterListe = new ArrayList<>();

    public BeraterVerwaltung() {
        beraterListe = ladeBerater();
    }

    public void beraterHinzufuegen(Berater berater) {
        beraterListe.add(berater);
    }

    public void beraterAnzeigen() {
        for (Berater b : beraterListe) {
            System.out.println(b.getName() + ", Personalnummer: " + b.getPersonalnummer());
        }
    }

    public void beraterSpeichernAlsJSON() {
        try (Writer writer = new FileWriter("berater.json")) {
            new GsonBuilder().setPrettyPrinting().create().toJson(beraterListe, writer);
        } catch (IOException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }

    private List<Berater> ladeBerater() {
        try (Reader reader = new FileReader("berater.json")) {
            Type type = new TypeToken<List<Berater>>() {}.getType();
            return new Gson().fromJson(reader, type);
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    public Berater findeBeraterNachName(String name) {
        for (Berater b : beraterListe) {
            if (b.getName().equalsIgnoreCase(name)) {
                return b;
            }
        }
        return null;
    }
    // In BeraternVerwaltung.java ergänzen
    public Berater beraterSuchenNachName(String name) {
    for (Berater b : beraterListe) {
        if (b.getName().equalsIgnoreCase(name)) {
            return b;
        }
    }
    System.out.println("Berater nicht gefunden: " + name);
    return null;
    }

     public void beraterLoeschen() {
        String name = ScannerUtils.getString("Name des Beraters, der gelöscht werden soll: ");
        Berater b = beraterSuchenNachName(name);
        if (b != null) {
            beraterListe.remove(b);
            System.out.println("Berater gelöscht: " + name);
            beraterSpeichernAlsJSON();
        } else {
            System.out.println("Berater nicht gefunden: " + name);
        }
    }

    
    public void beraterZuweisen(PatientVerwaltung patienten) {
        String patientenMerkmal = ScannerUtils.getString("Name des Patienten oder ID-Nummer: ");
        String beraterName = ScannerUtils.getString("Name des Beraters: ");

        // Prüfen, ob das Merkmal eine ID (nur Ziffern) oder ein Name ist
        String merkmalTyp = patientenMerkmal.matches("\\d+") ? "id" : "name";
        Patient p = patienten.patientSuchenNachMerkmal(patientenMerkmal, merkmalTyp);

        Berater b = beraterSuchenNachName(beraterName);

        if (p != null && b != null) {
            b.beraten(p);
            p.setZugewiesenerBerater(beraterName); // Beratername im Patient speichern
            patienten.patientenSpeichernAlsJSON(); // Änderungen speichern
            System.out.println("Berater " + beraterName + " wurde Patient " + p.getName() + " zugewiesen.");
        } else {
            System.out.println("Patient oder Berater nicht gefunden.");
        }
    }
 



    
    public void beraterHinzufuegenMitEingabe() {
        String name = ScannerUtils.getString("Name des Beraters: ");
        int alter = ScannerUtils.getInt("Alter des Beraters: ");
        String geschlecht = ScannerUtils.getString("Geschlecht des Beraters: ");
        String personalnummer = ScannerUtils.getString("Personalnummer des Beraters: ");
        
        Berater berater = new Berater(name, alter, geschlecht, personalnummer);
        beraterHinzufuegen(berater);
        beraterSpeichernAlsJSON();
    }

    public void beraterSuchenUndAnzeigen() {
        String name = ScannerUtils.getString("Name des Beraters: ");
        Berater b = beraterSuchenNachName(name);
        if (b != null) {
            System.out.println(b);
        } else {
            System.out.println("Berater nicht gefunden.");
        }
    }

    
    
}

