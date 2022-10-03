public class OOps {
    /*
    OOps, in java . basically java object-oriented programing language .
    you can search the theory part we will cover implementation of OOps.
     */

    public String name;
    public int tag ;
    public static void main(String[] args) {
        // here OOps is class and object we have to create .
        /*
        Three step of creating an object.
        1st-> declaration of reference variable
        2nd->  instantiation creating the object
        3rd->  initialising the object with values
         */

        OOps obj; // declaration of object but memory is not allocated yet .
        obj=new OOps(); // it allocates the memory and give reference to

        // there are many ways to initialise the values we will see each of them
        obj.name="super man";
        obj.tag=1;

        System.out.println("name is : "+obj.name+" "+"\ntag is : "+ obj.tag);
    }
}
