public class P2{
    static int convert(int n )
    {
        int temp = n;
        int count = 0;
        int n1 = 0 , n2 = 0;
        boolean alt = true;
        while(temp>0)
        {
            temp/=10;
            count++;
            
        }
        while(count>=0){
        int pow =(int) Math.pow(10, count);
        int mod = (n/pow)%10;
        if(alt)
                n1 = n1*10+mod;
        else
                n2 = n2*10+mod;
        count--;
        alt = !alt;
            }
            // System.out.println(n1 +" "+ n2);
            return n1+n2;

    }
    public static void main(String[] args)
    {
        int n = 286410;
        System.out.print(convert(n));

    }
}