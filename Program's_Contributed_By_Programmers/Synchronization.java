/*
Synchronization : in java is the capability to control the access of the multiple threads
over a shared resource.
types: 1. process synchronization
       2. Threads synchronization
       Thread synchronization types : 1. mutual exclusive synchronization method
                                      2. cooperation (inter thread communication)
 */
class Table {
    // synchronized method
    synchronized void PrintTable(int n){
        for (int i=1;i<11;i++){
            System.out.println(n*i);
        }
    }

    void Print(int x) {
        for (int i = 1; i < 11; i++) {
            System.out.println(x*i);
        }
    }
}
class MYthread1 extends Thread{
    Table t;
    MYthread1(Table t){
        this.t=t;
    }
    public void run(){
        t.PrintTable(5);
       // t.Print(2); // calling non synchronized method
    }
}
class MYthread2 extends Thread{
    Table t;
    MYthread2(Table t){
        this.t=t;
    }
    public void run(){
        t.PrintTable(7);
     //   t.Print(3);// calling non synchronized method
    }
}
public class Synchronization1 {
    public static void main(String[] args) {
        MYthread1 m1=new MYthread1(new Table());
        MYthread2 m2=new MYthread2(new Table());

        m1.start();
        m2.start();
        // only one is get executed first.
    }
}
