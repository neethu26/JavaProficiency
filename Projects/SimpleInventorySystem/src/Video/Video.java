package Video;

public class Video {

    private String title;
    private Boolean flag;
    private int rating;

    public Video(String title, boolean flag, int rating ){
        this.title = title;
        this.flag = flag;
        this.rating = rating;
    }

    public void setTitle(String title ){
        this.title = title;
    }
    
    public void setFlag(boolean flag) {
        this.flag = new Boolean(flag);
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return this.title;
    }


    public int getRating() {
        return this.rating;
    }

    public Boolean isCheckedOut() {
        return this.flag;
    }

    public Boolean isReturned() {
        return this.flag;
    }
    
}
