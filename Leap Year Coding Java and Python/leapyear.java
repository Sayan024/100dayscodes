import java.util.Scanner;

public class leapyear{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = sc.nextInt();
        // if(year%400==0 || (year%4==0 && year%100!=0)){
        //     System.out.println("Leap Year");
        // }
        // else{
        //     System.out.println("Not Leap Year");
        // }
        int f = (year%400==0 || (year%4==0 && year%100!=0))? 1:0;
        if(f==1){
            System.out.println("Leap Year");
     }
    else{
        System.out.println("Not Leap Year");
    }
    
}}