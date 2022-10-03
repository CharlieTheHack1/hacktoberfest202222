import java.util.Scanner;

// factorial using recursion in java

public class factorial_classes {
    public int factorial(int n){
        if(n==1) // base case
            return 1;
        return n*factorial(n-1); // recursive call
      // uses a top-down approach to multiply and return numbers from n to 1. 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        factorial_classes fc = new factorial_classes();
        System.out.println(fc.factorial(in));
    }
}
