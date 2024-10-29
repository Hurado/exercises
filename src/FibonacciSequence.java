import java.util.Scanner;

public class FibonacciSequence {
    public  void fibonacciSequence() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number <= 0) {
            System.out.println("Number have to be greater than 0");
            return;
        }
        int a = 0, b = 1;
        System.out.println("Fibonacci Sequence up to " + number + ": ");
        for(int i = 1; i <= number; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
