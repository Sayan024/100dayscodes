public class twoNumbersLCM{
    public static void main(String[] args) {
        int n1=36,n2=14,lcm=0;
        int max = n1>n2? n1: n2;
        for (int i = max ; i<=n1*n2;i++){
            if(i%n1==0 && i%n2==0){
                lcm=i;
                break;
            }
        }
        System.out.println("The LCM of "+n1+" and "+n2+" is "+lcm);
    }
}