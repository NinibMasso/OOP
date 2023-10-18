package Sprint2.Serialisering;

public class FordonMain {

    public void printViaInterface(Printable whatever){
        whatever.printMe();
    }

    public void printFordon(Fordon fordon){
        fordon.printMe();
    }

    public void printAntalHjul(Hjulburen hjul){
        System.out.println("Antal hjul: " + hjul.getAntalHjul());
    }
    public FordonMain() {

        Serialize s = new Serialize();
        Deserialize d = new Deserialize();
        d.läsaLista();

    }


    public static void main(String[] args) {
        FordonMain k = new FordonMain();

    }

}
