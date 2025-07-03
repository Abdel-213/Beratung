# 🏥 Krankenkassen-Verwaltungssystem (Java-Konsolenanwendung)

Ein einfaches Java-Konsolenprogramm zur Verwaltung von Patienten und Beratern für eine Krankenkasse. Das System erlaubt das Hinzufügen, Anzeigen, Suchen, Löschen und Zuweisen von Beratern zu Patienten sowie das Speichern aller Daten in JSON-Dateien.

---

## 📦 Funktionen

- 🧑‍⚕️ Patienten:
  - Patient hinzufügen
  - Alle Patienten anzeigen
  - Patient per Name oder ID suchen
  - Patient per ID löschen

- 👨‍💼 Berater:
  - Berater hinzufügen
  - Alle Berater anzeigen
  - Berater per Name suchen
  - Berater löschen

- 🔁 Zuweisung:
  - Zuweisung eines Beraters an einen Patienten

- 💾 Datenspeicherung:
  - Automatische Speicherung der Daten in JSON-Dateien (`patienten.json` und `berater.json`)

---

## 🛠️ Voraussetzungen

- Java 17 oder höher (z. B. [OpenJDK](https://jdk.java.net/))
- Eine Entwicklungsumgebung wie **VS Code**, **IntelliJ IDEA** oder einfach die **Kommandozeile**

---

## 🚀 Starten des Programms

### 1. Kompilieren:

```bash
javac -d bin src/krankenkasse/*.java

### Projektstruktur

 BERATUNG/
├── .vscode/                  # VS Code-Einstellungen (optional)
├── lib/                      # Externe Bibliotheken (z. B. Gson)
├── src/
│   └── krankenkasse/         # Hauptpaket mit allen Klassen
│       ├── Berater.java                # Modellklasse für Berater
│       ├── BeraterVerwaltung.java     # Verwaltung und Logik für Berater
│       ├── Beraterinterface.java      # Interface für Berateraktionen
│       ├── Beratungsprotokoll.java    # Modellklasse für Beratungsprotokolle
│       ├── Beratungsverwaltung.java   # Verwaltung der Beratungen
│       ├── Main.java                  # Einstiegspunkt des Programms
│       ├── Patient.java               # Modellklasse für Patienten
│       ├── PatientVerwaltung.java     # Verwaltung und Logik für Patienten
│       ├── Person.java                # Abstrakte Basisklasse für Patient/Berater
│       ├── ScannerUtils.java          # Klasse mit Hilfsmethoden zur Eingabe
│       └── Speichern.java             # Klasse mit Methoden zum Speichern/Laden von JSON-Dateien
├── berater.json              # JSON-Datei mit allen Beratern
├── beratungsprotokolle.json # JSON-Datei mit allen Beratungsprotokollen
├── patienten.json            # JSON-Datei mit allen Patienten
└── README.md                 # Projektbeschreibung


### Benutzeroberfläche (Textbasiert)


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