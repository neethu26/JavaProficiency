import java.util.*;

class ArrayListEven {
    

    protected ArrayList<Integer> evenNumbers;

    public ArrayList<Integer> saveEvenNumbers(int N) {
         evenNumbers = new ArrayList<Integer>(N);

        for(int i = 0 ; i < N ; i++)
            if(i % 2 == 0)
                evenNumbers.add(i);
        return evenNumbers;
        
    }

    public ArrayList<Integer> printEvenNumbers(ArrayList<Integer> even){
        ArrayList<Integer> square = new ArrayList<Integer>();

        for(Iterator<Integer> it = even.iterator(); it.hasNext(); )
            square.add(it.next() * 2);
        return square;
    } 

    public int printEvenNumber(int N) {
         
        for(int elem : this.evenNumbers) {
            if (elem == N) 
                return N;
            else
                continue;
    
        }
        return 0;
    }


    public static void main(String[] args){
        ArrayListEven obj = new ArrayListEven();
        for(Iterator<Integer> it = obj.saveEvenNumbers(10).iterator();
                it.hasNext();)
            System.out.println(it.next());
        System.out.println("\n");
        Iterator<Integer> it = obj.printEvenNumbers(obj.saveEvenNumbers(10)).iterator(); 
        for(;it.hasNext();)
            System.out.println(it.next());
         if(obj.printEvenNumber(2) != 0)
             System.out.println("Element found");
         else
             System.out.println("Element not found");
    }
}
