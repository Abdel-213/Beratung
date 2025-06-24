public abstract class Person {
    protected String name;
    protected int alter;
    protected String geschlecht;
    public Person(String name, int alter, String geschlecht){
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;

    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public String getGeschlecht() {
        String anrede;
        switch (geschlecht) {
            case "männlich":
                anrede = "Herr";
                break;
            case "weiblich":
                anrede = "Frau";
                break;
            default:
                anrede = "Divers";
                break;
        }
        return anrede;
    }

}
