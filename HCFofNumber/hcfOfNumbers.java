public class hcfOfNumbers{
    public static void main(String[] args) {
        int n1=84,n2=144,hcf=1;
        for(int i= 1;i<=n1||i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                hcf=i;
            }
        }
        System.out.println("The HCF of "+n1+" and "+n2+" is "+hcf);
    }
}