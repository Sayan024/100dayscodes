public class decimalToBinary{
    public static void main(String args[]){
        int d=12;
        int bi[] = new int[20];
        int i=0;
        while(d>0){
            int r=d%2;
            bi[i++]=r;
            d/=2;
        }
        System.out.println("Decimal to Binary");
        for(int j=i-1;j>=0;j--){
            System.out.print(bi[j]+"");
        }
    }
}