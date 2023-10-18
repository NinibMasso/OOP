package Sprint2.Serialisering;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {

    public void läsaLista() {
        try (ObjectInputStream oos = new ObjectInputStream(
                new FileInputStream("src/Sprint2/Serialisering/Storage.ser"))) {
            Object temp1 = oos.readObject();
            Object temp2 = oos.readObject();
            Object temp3 = oos.readObject();
            Object temp4 = oos.readObject();
            System.out.println(temp1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
