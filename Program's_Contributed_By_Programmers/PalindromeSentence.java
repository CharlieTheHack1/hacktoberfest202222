import java.util.*;
public class PalindromeSentence
{
    public String reverse(String str)
    {
        String rev = "";
        for(int i = 0; i <= str.length()-1; i++)
            rev = str.charAt(i) + rev;
        return rev;
    }
    public static void main(String[] args)
    {
        PalindromeSentence ob = new PalindromeSentence();
        Scanner sc=new Scanner(System.in);
        System.out.print("INPUT :\t");
        String str=sc.nextLine();
        String ends=".?!", word="", rev="";
        int j, l=str.length();
        if(ends.indexOf(str.charAt(l-1))==-1)
            System.out.println("\nINVALID INPUT");
        else
        {
            String s=str.substring(0,l-1) + " ";
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch!=' ')
                    word+=ch;
                else
                {
                    for(j=word.length()-1;j>=0;j--)
                        if(word.charAt(word.length()-1)!=word.charAt(j))
                            break;
                        if(word.equals(ob.reverse(word)))
                            rev+=word+" ";
                        else
                            rev+=word+ob.reverse((word.substring(0, j+1)))+" ";
                    word="";
                }
            }
            System.out.println("OUTPUT :\t"+str+"\n"+rev);
        }
    }
}
