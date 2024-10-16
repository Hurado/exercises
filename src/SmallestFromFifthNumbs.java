import java.util.Scanner;

public class SmallestFromFifthNumbs {
    Scanner sc = new Scanner(System.in);
    public void SmallestFromFifthNumbs() {
       int[] numbers = new int[5];

       for(int i = 0; i < numbers.length; i++) {
           numbers[i] = sc.nextInt();
       }

        int smallest = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }

        }
        System.out.println("Smallest number is: " + smallest);
    }
}
