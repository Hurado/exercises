import java.util.Scanner;

public class PrintingAllNumbers {

    public void PrintAllNumbers() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
