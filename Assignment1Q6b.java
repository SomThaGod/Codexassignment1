public class Assignment1Q6a{
    public static void main(String[] args){
         int y=400;
         if (y%100!=0){
             if (y%4==0){
                 System.out.println("Leap year");
             }
             else {
                 System.out.println("Not leap year");
             }
         }
         else {
             if(y%400==0){
                 System.out.println("Leap year");
             }
             else{
                 System.out.println("Not leap year");
             }
         }
    }
}