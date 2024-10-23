public class SumOfRationalNumbers {

    
    public static double sumOfRationalNumbers(int n) {
        double totalSum = 0.0;

        
        for (int i = 1; i <= n; i++) {
            totalSum += 1.0 / i;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int n = 5;
        double result = sumOfRationalNumbers(n);
        System.out.println("Sum of the first " + n + " rational numbers is: " + result);
    }
}