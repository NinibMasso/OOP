package Sprint2.InläsningSkrivningTillFil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private int length;
    private String name;
    List<Person> personList = new ArrayList<>();

    public Person(String name, int length) {
        this.name = name;
        this.length = length;
    }
    public Person(){}

    public List<Person> generateListFromFile(String tempPath){
        String tempLine;
        List<Person> list = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(
                new FileReader(tempPath))){
            while   ((tempLine = bf.readLine()) != null){
                tempLine = tempLine + bf.readLine();
                list.add(new Person(tempLine.substring(0, tempLine.indexOf(",")),
                        Integer.parseInt(tempLine.substring(tempLine.lastIndexOf(",") + 1).trim())));
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found Exception");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("IOException");
            e.printStackTrace();
        }
        return list;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
