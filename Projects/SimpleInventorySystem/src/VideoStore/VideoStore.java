package VideoStore;

import Video.Video;
import java.util.*;

public class VideoStore {
  
    private Map<String,Video> data;

    public VideoStore() {
        this.data = new HashMap<String,Video>();
    }

    public void addVideo(String title,Video video ){
        this.data.put(title,video);    
    }
   
    public void checkOut(String title) {
         this.data.get(title).setFlag(true);
    }
    
    public void returnedVideo(String title ){
        this.data.get(title).setFlag(false);
    }

    public void listInventory() {
        for(Map.Entry<String,Video> entry : this.data.entrySet())
            System.out.println(entry.getKey()+"\t"+entry.getValue().isCheckedOut());
    }
     
    public void listInventory(boolean temp) {
        System.out.println("Title_Of_Video  Rating  Checked/Not ");
        for(Map.Entry<String,Video> entry : this.data.entrySet()) {
         if ( entry.getValue().isCheckedOut().compareTo(new Boolean(temp)) != 0)
             continue;
         System.out.println(entry.getKey()+" "+entry.getValue().getRating()+" "+entry.getValue().isCheckedOut());
        }
    }


    public static void main(String[] args) {
        VideoStore data = new VideoStore();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Want to add Video !!");
        do{
            System.out.println("Enter the title of the video !!");
            String title = input.nextLine();
            data.addVideo(title,new Video(title,false,0)); 
            
        System.out.println("Want to add more !!( Yes/No )");
        }while(input.nextLine().equals("Yes"));


        System.out.println("Displaying all the videos !!!");
        data.listInventory();

        System.out.println("Want to check out any video !! (Yes / No)");
        if(input.next().equals("Yes")) {
            System.out.println("Please specify the title ");
            data.checkOut(input.next());
        }

        data.listInventory(true);
            
        

    }
  
}


