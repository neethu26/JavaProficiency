import java.util.*;


public class ArrayListInt {

    protected ArrayList addIntFloatDouble;
    
    public ArrayListInt(){
        this.addIntFloatDouble = new ArrayList();
    }


    public void readFromStdin(int number ) {
        this.addIntFloatDouble.add(number);   
    }

    public void readFromStdin(float number) {
        this.addIntFloatDouble.add(number);
    }

    public void readFromStdin(double number){
        this.addIntFloatDouble.add(number);
    }
    
    public int length() {
        return this.addIntFloatDouble.size();
    }

    public ArrayList returnArrayList() {
        return this.addIntFloatDouble;
    }

    public static void main(String[] args) {
        ArrayListInt dump = new ArrayListInt();
        dump.readFromStdin(2);
        dump.readFromStdin(2.5);
        dump.readFromStdin(23.450);

        ArrayList data = dump.returnArrayList();

        for(int i =0 ; i < dump.length(); i++){
            System.out.println(data.get(i));
        }


    }   
}
