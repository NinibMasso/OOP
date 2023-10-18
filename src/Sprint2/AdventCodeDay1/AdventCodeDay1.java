package Sprint2.AdventCodeDay1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AdventCodeDay1 {

    public int[] readFile(String fileName, int[] list) throws IOException {

        Scanner readFile = new Scanner(new File(fileName));

        int num;
        int i = 0;
        while   ((readFile.hasNextInt())){
            num = readFile.nextInt();
            list[i] = num;
            i++;
        }
        return list;
    }
    public int iterateOverArray(int list[]){
        int counter = 0;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] < list[i+1]){
                counter++;
            }

        }
        return counter;
    }

}
