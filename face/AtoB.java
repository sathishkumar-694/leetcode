import java.io.*;
import java.util.*;

public class AtoB{
    public static int solve(String a1 , String b1 , int n )
    {
        char a[] = a1.toCharArray();
        char b[] = b1.toCharArray();
        int i = 0 ;
        int count = 0;
        char temp = ' ';
        while(i<n )
        
        {
            char ch1 = a[i];
            char ch2 = b[i];
            if(ch1 != ch2)
            {
                count++;
                if(ch1 < ch2)
                    temp = ch1;
                else
                    temp = ch2;
                a[i] = temp;
            }
            i++;
        }
        
        for(i = 0 ; i< n ; i++)
        {
            char ch1 = a[i];
            char ch2 = b[i];
            if(ch1 != ch2)
                return -1;
        }
        return count != n ? count  : -1;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int n = inp.nextInt();
        inp.nextLine();
        String a = inp.nextLine();
        String b = inp.nextLine();
        
        System.out.print(solve(a , b , n));
}
}
