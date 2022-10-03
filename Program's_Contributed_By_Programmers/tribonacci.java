import java.util.*;
import java.math.*;
class tribonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        
        BigInteger a=new BigInteger("0");
        BigInteger b=new BigInteger("0");
        BigInteger c=new BigInteger("1");
        BigInteger d=new BigInteger("0");

        // long a=0,b=0,c=1,d;
        
        System.out.print(a+", "+b+", "+c);
        for(int i=4;i<=n;i++){
            d=a.add(b);
            d=d.add(c);
            System.out.print(", "+c);    
            a=b;    
            b=c;    
            c=d;
        }
        sc.close();
        System.out.println();
    }
}
