package krankenkasse;

public class Patient extends Person{
    private String versichertennummer;
    public Patient(String name, int alter,String geschlecht, String versichertennummer) {
        super(name, alter, geschlecht);
        this.versichertennummer = versichertennummer;
    }

    public String getVersichertennummer() {
        return versichertennummer;
    }

    @Override
    public String toString() {
        return "Patient{" + name  +
                "versichertennummer='" + versichertennummer + '\'' +
                '}';
    }


}
