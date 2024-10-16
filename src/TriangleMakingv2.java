import java.util.Scanner;

public class TriangleMakingv2 {

    Scanner sc = new Scanner(System.in);
    int height = sc.nextInt();

    public void Triangle() {
    for (int i = 1; i <= height; i++) {
        for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
    }
    }
}
