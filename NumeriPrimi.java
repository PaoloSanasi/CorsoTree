public class NumeriPrimi {
    public static void main(String[] args) {
        int number = 0;
        System.out.println(isPrime(number));
        number = 17;
        System.out.println(isPrime(number));
        number = 631;
        System.out.println(isPrime(number));
        number = 634;
        System.out.println(!isPrime(number));
        number = 999;
        System.out.println(!isPrime(number));
        number = 997;
        System.out.println(isPrime(number));
    }

    private static boolean isPrime(int number) {
        int i;
        for (i = 0; i <= number; i++) {
            if (i == number/2)
                return true;

            }
        return false;
    }
    }

