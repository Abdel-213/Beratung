public class Main {
    public static void main(String[] args) {
         Patient patient = new Patient("Werner Lauterbach", 66,"männlich", "1554654668");
       Berater berater = new Berater("Eisenhauer", 51, "weiblich", "500265");
       berater.beraten(patient);
    }

}

