package Sprint2.AdventCodeDay1;


import java.io.IOException;

public class AdventCodeDay1Main {


    AdventCodeDay1Main() throws IOException {
        String fileName = "C:\\JavaProgram\\OOP\\src\\texttest.txt";
        int[] list = new int[100000];
        AdventCodeDay1 adventCodeDay1 = new AdventCodeDay1();
        adventCodeDay1.readFile(fileName, list);
        int result = adventCodeDay1.iterateOverArray(list);
        System.out.println(result);

    }

    public static void main(String[] args) throws IOException {
        AdventCodeDay1Main a = new AdventCodeDay1Main();
    }


}
