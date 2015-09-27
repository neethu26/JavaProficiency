import java.util.*;

public class CollectCards {
    
    protected ArrayList<Integer> array;
    protected Map<String,ArrayList<Integer>> card;

    public CollectCards(){
        this.array = new ArrayList<Integer>();
        this.card = new HashMap<String,ArrayList<Integer>>();
    }

    
    public void addCard(String name,int number) {
        if(this.card.containsKey(name)) {
            ArrayList<Integer> arr = this.card.get(name);
            arr.add(number);
            System.out.println(arr);
        }else {
            this.array = new ArrayList<Integer>();
            this.array.add(number);
            this.card.put(name,this.array);
        }
        
        System.out.println(this.card);
            
    }

    public void display(){
        for(Map.Entry<String,ArrayList<Integer>> card : this.card.entrySet()){
            System.out.println(card.getKey()+"\t"+card.getValue());
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        CollectCards card = new CollectCards();
        do{
            System.out.println("Enter the card detais");
            card.addCard(input.next(),input.nextInt());            
            System.out.println("Want to repeat again!!!");
        }while(input.next().equals("Yes"));

        card.display();
    }

}
