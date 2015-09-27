import java.lang.*;

class NumberFormat {

    public static void main(String[] args) {
        try{
            int i = Integer.parseInt(args[0]);
            System.out.println(i);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }/*catch(NumberFormatException e){
            System.out.println(e);
        }*/
    }
}
