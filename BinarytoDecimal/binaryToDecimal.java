import java.util.Scanner;
public class binaryToDecimal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any binary number: ");
        int bi = sc.nextInt();
        int binary = bi;
        int d=0,n=0;
        while(bi>0){
            int t = bi%10;
            d+=t*Math.pow(2,n);
            bi/=10;
            n++;
        }
        System.out.println("Binar to decimal: \nBinary: "+binary+":-> Decimal "+d);
    }
}