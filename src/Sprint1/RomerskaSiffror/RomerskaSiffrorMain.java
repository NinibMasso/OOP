package Sprint1.RomerskaSiffror;

public class RomerskaSiffrorMain {
    public static void main(String[] args) {
       for (Siffror s: Siffror.values()){
            System.out.println("Romerska siffan: " + s.getLetter() + " = " + s.getVärde());
        }
    }
}
