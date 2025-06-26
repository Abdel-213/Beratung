package krankenkasse;

public class Berater extends Person implements Beratunginterface {
    private String personalnummer;

    public Berater(String name, int alter, String geschlecht, String personalnummer) {
        super(name, alter, geschlecht);
        this.personalnummer = personalnummer;
    }

    public String getPersonalnummer() {
        return personalnummer;
    }

    @Override
    public void beraten(Patient patient) {
        System.out.println("Beratung durch " + getName() + " für " + patient.getName());
    }
}
