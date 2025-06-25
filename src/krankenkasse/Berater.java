package krankenkasse;

public class Berater extends Person implements Beratunginterface {
    private String personalnummer;

    public Berater(String name, int alter, String geschlecht, String personalnummer){
        super(name, alter, geschlecht);
        this.personalnummer = personalnummer;
    }

    @Override
    public void beraten(Patient patient) {
        System.out.println("Beratung für: "+ patient.getGeschlecht()+" "+ patient.getName());
        System.out.println("die Beratung für "+ patient.getGeschlecht() +" "+ patient.getName() + " wird von "+ getGeschlecht()+" "+getName() + " durchgeführt.");
        if (patient.getAlter() > 65) {
            System.out.println("Empfehlung: Bitte prüfe den Seniorentarif für "+ patient.getGeschlecht() +" "+ patient.getName());
            System.out.println("Hinweis: Zusatzversicherung möglich.");
        }else if (patient.getAlter() > 40) {
            System.out.println("Hinweis: Zusatzversicherung möglich.");
        } else {
            System.out.println("Alles im grünen Bereich.");
        }
    }

}