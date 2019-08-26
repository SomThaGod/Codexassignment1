import javax.lang.model.util.ElementScanner6;

public class Assignment1Q6a{
    public static void main(String[] args){
        int y=2014;
        if (y%400==0) 
        {
            System.out.print("Leap year");
        }
        else if (y%100==0)
        {
            System.out.print("Not leap year");
        }
        else if (y%4==0)
        {
            System.out.print("Leap year");
        }
        else 
        {
            System.out.print("Not a leap Year");
        }
         
    }
}