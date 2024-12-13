
import java.util.Scanner;

public class permutations{
    public static void main(String args[]){
        int f1,f2,n,r,num,nper;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of seats");
        n = sc.nextInt();
        System.out.println("Enter number of selected seats");
        r = sc.nextInt();
        f1=1;
        for(int i=n;i>1;i--){
            f1*=i;
        }
        num=n-r;
        f2=1;
        for(int j=num;j>1;j--){
            f2*=j;
        }
        nper =f1/f2;
        System.out.println(nper+" ways");
        
    }
}