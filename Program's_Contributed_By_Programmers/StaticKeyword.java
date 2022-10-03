import java.util.Scanner;

/*
Static : is used for class variables , class methods , static blocks .
-> a static member belong to whole class instead of object of the class
-> a static member can be accessed before creating any object of class.
-> can be called with object also.
 */
class StaticMethods{
    public static  void StaticFunction(){
        System.out.println("Static function is called !");
    }
    public static boolean isEven(int x){
        return  (x%2==0) ;
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        // see main is static so that we can use it without creating any object.

        /*
        we can call a static function without object by this syntax : class_name.method_name(arguments) ;
         */
        Scanner in=new Scanner(System.in);
        StaticMethods.StaticFunction(); // calling without object
        System.out.println("enter the number : ");
        int num=in.nextInt();
      boolean IsEven=  (new StaticMethods()).isEven(num);
        System.out.println("Num is even : "+IsEven);

    }
}
