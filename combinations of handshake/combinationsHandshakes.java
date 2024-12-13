import java.util.Scanner;
public class combinationsHandshakes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons :");
        int n = sc.nextInt();
        int t = n * (n-1)/2;
        System.out.println("For "+n+" people them will be handshakes "+t+" handshakes");
    }
}