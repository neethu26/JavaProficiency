abstract class abstractclass {
    protected String type;
    public abstract String notice(abstractclass e);
}

public class Compartment extends abstractclass {

    public Compartment(){
        this.type = "I am in Compartment";
    }   


    public String notice(abstractclass e) {
        return e.type;
    }

    public static void main(String[] args) {
     abstractclass c = new Compartment();
     System.out.println(c.notice(c));
    }   
}


