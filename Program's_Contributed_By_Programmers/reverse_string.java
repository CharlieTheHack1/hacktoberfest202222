import java.util.*;
/**
 * 3 kinds of reverse:
 * Input: Anonymous Hacker forever
    1st type: reverof rekcaH suomynonA  // reverse the sentence by letters
    2nd type: suomynonA rekcaH reverof  // reverse the sentence by letters and words
    3rd type: forever Hacker Anonymous // reverse the order of words.
 */
public class reverse_string
{
    public static void main(String args[]   ){
        System.out.print('\u000C');
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String s = sc.nextLine();
        String r = "";
        String row = "";
        String l = "";
        int ll=0; 
        String ss = "";
        int sss=0; 
        for(int i = s.length()-1;i>=0;i--)
        {
            r+=s.charAt(i);
        }
        sss=(s.substring(0,s.indexOf(" "))).length();
        int a = 0;
        String r2="";
        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i); //extracting the current character at index i
            char ch1=s.charAt(i-1);
            if(ch==32 && ch1==32) //two or more continous space
            {
                a++;
                r2+=" ";
                continue;
            }
            if(ch==32||i==s.length()-1) //extract a word when u find space or u come to end of the string
            {
                String w=s.substring(a,i);
                if(i==s.length()-1)
                    w=s.substring(a);
                String rw = "";
                if(w.length()>ll){
                 ll = w.length();
                 l = w;
                }
                if(w.length()<sss){
                 sss = w.length();
                 ss = w;
                }
                for(int j = w.length()-1;j>=0;j--)
                {
                    rw+=w.charAt(j);
                }
                r2+=rw;
                r2+=" ";
                a=i+1; //change the next word begin
            } //close the if
        }
        for(int i = r2.length()-1;i>=0;i--)
        {
            row+=r2.charAt(i);
        }
        System.out.println();
        System.out.println("1st type: "+r);
        System.out.println("2nd type: "+r2);
        System.out.println("3rd type: "+row);
        // System.out.println("Longest Length: "+ll);
        // System.out.println("Longest Word: "+l);
        // System.out.println("Shortest Length: "+sss);
        // System.out.println("Shortest Word: "+ss);
        sc.close();
    }
}
