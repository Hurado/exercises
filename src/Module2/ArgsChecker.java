package Module2;

import java.util.Scanner;

public class ArgsChecker {

    public void biggerSmallerThan0 () {
    Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 0) {
            System.out.println("Number is smaller than 0 and its: " + number);
        } else if (number > 0) {
            System.out.println("Number is bigger than 0 and its: " + number);
        } else {
            System.out.println("Number is equal 0 because number is: " + number);
        }
    }
}
