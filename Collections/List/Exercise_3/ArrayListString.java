import java.util.*;

public class ArrayListString {

    public ArrayList<String> storeStrings(){
        ArrayList<String> name = new ArrayList<String>();
        name.add("james");
        name.add("johnson");
        name.add("jommy");
        name.add("jossy");
        name.add("ansu");
        name.add("chinnu");
        name.add("achu");
        name.add("chichu");

        return name;
    }

    public void print(ArrayList<String> names) {
        for(String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        ArrayListString test = new ArrayListString();
        test.print(test.storeStrings());
    }

}
