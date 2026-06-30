import java.util.*;
public class Permute
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int T = inp.nextInt();
        for(int j = 0 ; j<T ; j++)
        {
            int res = 1 , k = inp.nextInt();
            int n = inp.nextInt();  
            for(int i= 0 ; i< n ; i++)
                res = res*(k-i)%1000000007;
            System.out.print(res+" ");
        }
    }
}