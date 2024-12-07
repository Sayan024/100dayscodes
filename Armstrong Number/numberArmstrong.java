public class numberArmstrong{
    public static void main(String[] args) {
        int num = 87;
        int len = order(num);
        if(Armstrong(num,len)){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not a armstrong");
        }
    }
        static int order(int x){
            int len=0;
            while(x!=0){
                len++;
                x/=10;
            }
            return len;
        }
        static boolean Armstrong(int num, int len){
            int digit,s=0;
            int temp=num;
            while(temp!=0){
                digit=temp%10;
                s=s+(int)Math.pow(digit,len);
                temp/=10;
            }
            return num==s;
        }
    }