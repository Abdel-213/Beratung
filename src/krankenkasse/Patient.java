package krankenkasse;

public class Patient extends Person {
    private String id;
    private String versichertennummer;
    private String zugewiesenerBerater;

    public Patient(String id, String name, int alter, String geschlecht, String versichertennummer, String zugewiesenerBerater) {
        super(name, alter, geschlecht);
        this.id = id;
        this.versichertennummer = versichertennummer;
        this.zugewiesenerBerater = zugewiesenerBerater;
  
    }

    public String getVersichertennummer() {
        return versichertennummer;
    }
    public String getId() {
        return id;
    } 

    public void setId(String id) {
        this.id = id;
    }
     @Override
    public String toString() {
        return "Patient{" +
                "Name='" + getName() + '\'' +
                ", Alter=" + getAlter() +
                ", ID='" + id + '\'' +
                '}';
    }

    public void setZugewiesenerBerater(String beraterName) {
        this.zugewiesenerBerater = beraterName;
    }

    public String getZugewiesenerBerater() {
        return zugewiesenerBerater;
        
    }
}
