public class Assignment1Q6a{
    public static void main(String[] args){
        int y=0;
        if((y%4==0)&&(y%100!=0)||(y%400==0))
            {
            System.out.println("Leap Year");
            }
        else{
            System.out.print("Not Leap Year");
            }
    }
}