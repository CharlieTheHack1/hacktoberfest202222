import java.util.*;
public class num_to_word
{
    private static int extract(long n, int i){
        return Integer.parseInt(Character.toString((Long.toString(n)).charAt(i)));
    }

    private static int extract(int n, int i){
        return Integer.parseInt(Character.toString((Integer.toString(n)).charAt(i)));
    }

    public static String it(int n){
        String un[]={"one","two","three","four","five","six","seven","eight","nine"};
        String tn[]={"thir","four","fif","six","seven","eigh","nine"};
        if(n>0){ 
            if(n<10)
                return un[n-1];
            else if(n==10)
                return "ten";    
            else if(n==11)
                return "eleven";    
            else if(n==12)
                return "twelve";    
            else if(n<20)
                return tn[n-13]+"teen";              
            else if(n<100){           
                String s="";
                String hn[]={"twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety "};
                s+=hn[extract(n,0)-2];
                try{
                    s+=un[extract(n,1)-1];
                }
                catch(Exception e){
                    s+="";
                }
                return s;
            }
            else if(n<1000)
                return un[(int)(n/100)-1]+" hundred "+it(n%100);        
            else if(n<100000)        
                return it(n/1000)+" thousand and "+it(n%1000);        
            else if(n<10000000)       
                return it(n/100000)+" lakhs and "+it(n%100000);
            else         
                return it(n/10000000)+" crores and "+it(n%10000000);
        }
        else if(n<0)
            return "-"+it(Math.abs(n));
        else if(n==0)
            return "zero";
        return ""; 
    }

    public static String it(long n){
        String un[]={"one","two","three","four","five","six","seven","eight","nine"};
        String tn[]={"thir","four","fif","six","seven","eigh","nine"};
        if(n>0){ 
            if(n<10)
                return un[(int)(n-1)];
            else if(n==10)
                return "ten";    
            else if(n==11)
                return "eleven";    
            else if(n==12)
                return "twelve";    
            else if(n<20)
                return tn[(int)(n-13)]+"teen";              
            else if(n<100){           
                String s="";
                String hn[]={"twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety "};
                s+=hn[extract(n,0)-2];
                try{
                    s+=un[extract(n,1)-1];
                }
                catch(Exception e){
                    s+="";
                }
                return s;
            }
            else if(n<1000)
                return un[(int)(n/100)-1]+" hundred "+it(n%100);        
            else if(n<100000)        
                return it(n/1000)+" thousand and "+it(n%1000);        
            else if(n<10000000)       
                return it(n/100000)+" lakhs and "+it(n%100000);
            else         
                return "( "+it(n/10000000)+" ) crores and "+it(n%10000000);
        }
        else if(n<0)
            return "-"+it(Math.abs(n));
        else if(n==0)
            return "zero";
        return ""; 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long in = sc.nextLong();
        System.out.println(it(in));
        sc.close();
    }
}
