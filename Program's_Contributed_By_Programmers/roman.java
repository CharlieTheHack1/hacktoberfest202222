import java.util.*;

public class roman {
    public static String convert(int s){
        String r="";
        if(s<4){
            for(int i=0;i<s;i++)
                r+="I";
        }
        else if(s==4)
            r="IV";
        else if(s<9){
            r="V";
            r+=convert(s-5);
        }
        else if(s==9)
            r="IX";
        
        else if(s<40){
            for(int i=0;i<s/10;i++)
                r+="X";
            r+=convert(s%10);
        }

        else if(s<49){
            r="XL";
            r+=convert(s%10);
        }

        else if(s==49){
            r="XLIX";
        }
        else if(s==50){
            r="L";
        }
        
        else if(s<90){
            r+="L";
            for(int i=0;i<(s/10)-5;i++)
                r+="X";
            r+=convert(s%10);
        }
        else if(s<99){
            r="XC";
            r+=convert(s%10);
        }
        else if(s==99){
            r="XCIX";
        }
        else if(s==100){
            r="C";
        }
        
        else if(s<400){
            for(int i=0;i<s/100;i++)
                r+="C";
            r+=convert(s%100);
        }
        else if(s<=499){
            r="CD";
            r+=convert(s%100);
        }
        else if(s==500){
            r="D";
        }

        else if(s<900){
            r+="D";
            for(int i=0;i<(s/100)-5;i++)
                r+="C";
            r+=convert(s%100);
        }
        else if(s<999){
            r="CM";
            r+=convert(s%100);
        }
        else if(s==1000){
            r="M";
        }

        else if(s<=3999){
            for(int i=1;i<(s/1000);i++)
                r+="M";
            r+=convert(s%1000);
        }
        return r;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a int");
        int s = sc.nextInt();
        System.out.println(convert(s));
        sc.close();
    }
}
