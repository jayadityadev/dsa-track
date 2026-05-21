public class PrimeCheck {
    public static boolean check_prime(int num) {
        if (num < 2) return false; // handles 0, 1, negatives
        if (num == 2) return true; // handle the one even prime
        if (num % 2 == 0) return false; // handle remaining evens

        // find divisors
        for (int i = 3; i * i <= num; i+=2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++)
            if (check_prime(i))
                System.out.println(i);
    }
}
