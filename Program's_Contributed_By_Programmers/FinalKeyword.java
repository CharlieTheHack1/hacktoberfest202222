/*
Final : is keyword used to restrict the user so that the members declared final can not be modified
it can be used before the methods , classes , variables .
 */
class  FinalExample{
    final int var=20; // it can not be modified now
    /*
    if we try to change it will give compiler error.
     */
    void run(){
        //var=100; // will give error
    }

    // final methods
    final void show(){
        System.out.println("try to change finalize method ! ");
    }
}
public class Final extends  FinalExample{
/*
  final void show(){
        System.out.println("trying  to change finalize method ! ");
    }
*/
  public static void main(String[] args) {
      Final f=new Final();
   //   f.run(); // will give error

      // a final method is also inherited if we did not override it
      f.show(); // will not give error if not override
  }
}
