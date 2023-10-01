package Sprint1.Fordon;

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
        Bil bil = new Bil(300, 5000, 6, 2);
        Båt båt = new Båt(400, 20000, 300);
        Tåg tåg = new Tåg(1000, 3000, 12);
        Cykel cykel = new Cykel(25, 10, 21, 3);
        bil.printMe();
        båt.printMe();
        tåg.printMe();
        cykel.printMe();

        System.out.println();

        printViaInterface(bil);
        printAntalHjul(bil);
        printViaInterface(båt);
        printViaInterface(tåg);
        printViaInterface(cykel);
        printAntalHjul(cykel);
    }


    public static void main(String[] args) {
        FordonMain k = new FordonMain();

    }

}
