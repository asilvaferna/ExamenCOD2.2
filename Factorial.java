package factorial;

public class Factorial {

    public static void main(String[] args) {

        int j, factorial;

        j = 8;

        int i;
        if (j == 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (i = j; i >= 1; i--) {
                factorial = factorial * i;
            }
        }

        System.out.println(factorial);

    }
}
