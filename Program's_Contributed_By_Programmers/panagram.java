import java.util.*;

//Panagram sentence is one which contains all letters of English alphabets in it.
public class panagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        int p=0;

        for(char a = 'A';a<='Z';a++){
            //System.out.println(a);
            int cc=0;
            for (int i = 0; i < s.length(); i++) {
                //System.out.println(a);
                char c = s.toUpperCase().charAt(i);
                if(Character.isLetter(c)){
                    if(c==a)
                        cc=1;
                }
            }
            if(cc==1)
                p++;
        }
        sc.close();
        System.out.println(p==26?"It is panagram":"not a panagram");
    }
}
