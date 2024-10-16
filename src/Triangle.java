import java.util.Scanner;

public class Triangle {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    int lg, ls;

    public void fullTriangleMaking() {

       for(int w = 1;w<=a;w++)

    {
        ls = a - w; //liczba spacji
        for (int s = 1; s <= ls; s++)
            System.out.print(" ");

        lg = 2 * w - 1; // liczba gwiazdek
        for (int g = 1; g <= lg; g++)
            System.out.print("*");

        System.out.println();
    }

    }

    public void triangleMaking1() {
        for(int i = 1; i <= a; i++) {
           for(int j = 1; j <= a - i;j++) {
               System.out.print(" ");
           }
        for (int j = 1; j <= i ; j++) {
            System.out.print("*");
        }
        System.out.println();
        }
    }
    public void triangleMaking2() {
        for(int i = 1; i <= a; i++) {
//            for(int j = 1; j <= a - i;j++) {
//                System.out.print(" ");
//            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }
