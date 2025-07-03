package krankenkasse;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Speichern {
    public static void speichereBeratungInDatei(Beratungsprotokoll protokoll) {
        try (Writer writer = new FileWriter("beratungsprotokolle.json", true)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(protokoll, writer);
            writer.write("\n"); // Neue Zeile für jede Beratung
        } catch (IOException e) {
            System.out.println("Fehler beim Speichern der Beratung: " + e.getMessage());
        }
    }

}
