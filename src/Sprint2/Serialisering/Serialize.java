package Sprint2.Serialisering;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Serialize implements Serializable {

    public void skapaLista(){
        List<Fordon> fordonLista = new ArrayList<>();
        fordonLista.add(new Bil(300, 5000, 6, 2));
        fordonLista.add(new Båt(400, 20000, 300));
        fordonLista.add(new Tåg(1000, 3000, 12));
        fordonLista.add(new Cykel(25, 10, 21, 3));

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("src/Sprint2/Serialisering/Storage.ser"))){
            for (int i = 0; i < fordonLista.size(); i++) {
                oos.writeObject(i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
