public class Constructor {
    /*
    name : kailash
    topic : construct in java
    date : 22/9/21
     */

    int tag;
    String name;
    int rating;

    Constructor(){
        System.out.println("object is created");
    }
    Constructor(int t,String n,int r){
        name=n;
        tag=t;
        rating=r;
    }
    public void  display(){
        System.out.println("the name is : "+name);
        System.out.println("the tag is : "+tag);
        System.out.println("the rating is : "+rating);
    }
    public static void main(String[] args) {
        /*
        constructor in java are the blocks of code like methods in java having same name of class.
        it is invoked when instance of class is created.
        constructor are two type :
         1st -> default or non argument constructor.
         2nd->  parameterised constructors
         */
        Constructor s1=new Constructor(); // default constructor
        Constructor s2=new Constructor(1,"super man",10);  // parameterised constructor

        System.out.println("displaying information.....");
        s1.display(); // not initialised yet default constructor is called
        s2.display();
    }
}
