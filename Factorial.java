package factorial;

public class Factorial {

    public static void main(String[] args) {

        int j = 8;

        System.out.println(calculaFactorial(j));

    }

    public static int calculaFactorial(int j) {
        int factorial, i;
        if (j == 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (i = j; i >= 1; i--) {
                factorial *= i;
            }
        }
        return factorial;
    }
}
