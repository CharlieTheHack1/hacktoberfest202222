import java.util.*;
import java.math.*;
public class fibonacci{
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        BigInteger a=new BigInteger("0");
        BigInteger b=new BigInteger("1");
        BigInteger c=new BigInteger("0");
        // long a=0,b=1,c;
        System.out.print(a+", "+b);
        for(int i=3;i<=n;i++){
            c=a.add(b);
            System.out.print(", "+c);    
            a=b;    
            b=c;    
        }
        sc.close();
        System.out.println();
    }
}
