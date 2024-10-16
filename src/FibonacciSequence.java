import java.util.Scanner;

public class FibonacciSequence {
    public  void fibonacciSequence() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum = 0;
        if(number <= 0) {
            System.out.println("Number have to be greater than 0");
            return;
        }
        int a = 0, b = 1;
        System.out.println("Fibonacci Sequence up to " + number + ": ");
        while (a <= number ) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }
}
