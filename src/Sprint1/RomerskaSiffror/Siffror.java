package Sprint1.RomerskaSiffror;

public enum Siffror {
    I ("I", 1),
    V ("V", 5),
    X ("X", 10),
    L ("L", 50),
    C ("C", 100),
    D ("D", 500),
    M ("M", 1000);
    public final int värde;
    public final String letter;

    Siffror(String l, int v){
        letter = l;
        värde = v;
    }

    public int getVärde() {
        return värde;
    }

    public String getLetter() {
        return letter;
    }
}
