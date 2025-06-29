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

  src/krankenkasse(package)
  ├── Main.java
  ├── Patient.java
  ├── Berater.java
  ├── PatientVerwaltung.java
  ├── BeraterVerwaltung.java
  ├── ScannerUtils.java
  ├── Beratunginterface.java
  ├── Person.java (abstract)

├── patienten.json
├── berater.json

BERATUNG/
├── .vscode/
├── lib/
├── src/
├── berater.json
├── patienten.json
├── README.md 

### Benutzeroberfläche (Textbasiert)


 K R A N K E N K A S S E   M E N Ü
========================================
1.  Patient hinzufügen
2.  Patienten anzeigen
3.  Patient löschen
4.  Berater hinzufügen
5.  Berater anzeigen
6.  Berater lösch
    ========================================
7.  Berater zuweisen
    ========================================
0.  Beenden
