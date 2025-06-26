package krankenkasse;

public abstract class Person {
    protected String name;
    protected int alter;
    protected String geschlecht;

    public Person(String name, int alter, String geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }

    public String getName() { return name; }
    public int getAlter() { return alter; }
    public String getGeschlecht() { return geschlecht; }

      
    public void setName(String name) { this.name = name; }
}   
    

