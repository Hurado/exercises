public class CalculatingFactorials {
    public int resultOfFactorial(int n) {
        if(n <= 0) {
            System.out.println("Give a positive number");
            return 0;
        }
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
    return fact;
    }
}
