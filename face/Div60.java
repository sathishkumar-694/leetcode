import java.util.*;
public class Div60
{
    public static String solve(String s)
    {
        int sum = 0 , zeroCount = 0 , evenCount = 0;
        for(char ch : s.toCharArray())
        {
            int dig = ch-'0';
            sum+=dig;
            if(dig%2 == 0)
                evenCount++;
            if(dig == 0)
                zeroCount++;
        }
        return sum%3 == 0 && zeroCount>0 && evenCount>1 ? "YES":"NO";
    }
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        String nums[] = new String[n];
        for(int i = 0 ; i< n ; i++)
                nums[i] = inp.next();
        for(int i = 0 ; i< n ; i++)
            System.out.println(solve(nums[i]));  
    }
}