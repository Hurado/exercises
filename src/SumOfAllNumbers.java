import java.util.Scanner;

public class SumOfAllNumbers {
    public void SumOfAllNumbers() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <= number; i++ ) {
            sum += i;
        }
        System.out.println(sum);
    }
}
