import java.util.Scanner;

public class AverageThreeNumb {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();


    public void AverageThreeNumb() {
        if(num1 > 0 && num2 > 0 && num3 > 0) {
            System.out.println((num1 + num2 + num3)/3);
        }
        else {
            System.out.println("Numbers your provided cannot be lower and equal 0");
        }
    }
}
