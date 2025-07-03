package krankenkasse;

public class Beratungsprotokoll {
    private String patientenname;
    private String beratername;
    private String datum;
    private String uhrzeit;
    private String dauer;
    private String thema;
    private String notizen;


    public Beratungsprotokoll(String patientenname, String beratername, String datum, String uhrzeit, String dauer, String thema, String notizen) {
        this.patientenname = patientenname;
        this.beratername = beratername;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.dauer = dauer;
        this.thema = thema;
        this.notizen = notizen;
    }
    public String getPatientenname() {
        return patientenname;
    }

    public String getBeratername() {
        return beratername;
    }
    public String getDatum() {
        return datum;
    }
    public String getUhrzeit() {
        return uhrzeit;
    }
    public String getDauer() {
        return dauer;
    }
    public String getThema() {
        return thema;
    }
    public String getNotizen() {
        return notizen;
    }
    public void setPatientenname(String patientenname) {
        this.patientenname = patientenname;
    }
    public void setBeratername(String beratername) {
        this.beratername = beratername;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }
    public void setUhrzeit(String uhrzeit) {
        this.uhrzeit = uhrzeit;
    }
    public void setDauer(String dauer) {
        this.dauer = dauer;
    }
    public void setThema(String thema) {
        this.thema = thema;
    }
    public void setNotizen(String notizen) {
        this.notizen = notizen;
    }



}
