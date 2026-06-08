import java.io.*;
import java.util.*;

public class NoOfWays {
    static int fact(int n)
    {
        if(n<=1)
            return 1;
        else    
            return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int tP = inp.nextInt();
        int tE = inp.nextInt();
        int bP= inp.nextInt();
        int bE = inp.nextInt();
        
        int pencil = tP == bP ? 1 :
        fact(tP)/(fact(bP)*fact(tP-bP));
        
        int eraser = tE == bE ? 1 :
        fact(tE)/(fact(bE)*fact(tE-bE));
        System.out.print(pencil*eraser); 
        

    }
}
