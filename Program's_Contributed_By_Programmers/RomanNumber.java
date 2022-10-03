import java.io.*; 
class RomanNumber
{
    public static void main(String args[]) throws IOException 
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.print("Enter a number : ");
        int n=Integer.parseInt(br.readLine());
        
        if(n>0 && n<=3000) 
        {
            int h = n;
            int a[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String ra[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            String x = "";
            for (int i = 0; i < a.length; i++)
            {
                while (h >= a[i])
                {
                    x += ra[i]; //x = x + ra[i];
                    h -= a[i]; //h = h- a[i];
                }
            }
            System.out.println("Roman Number = "+x);
        }
        else
            System.out.println("Invalid Input");
    } 
} 
