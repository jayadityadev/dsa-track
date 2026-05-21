public class GreatestCommonDivisor {
    
    public static int greatest_common_divisor(int num1, int num2) {
        for (int i = Integer.min(num1, num2); i >= 1; i--)
            if (num1 % i == 0 && num2 % i == 0)
                return i;
        return 1;
    }

    public static int euclidean_gcd(int num1, int num2) {
        return (num2 > 0) ? euclidean_gcd(num2, num1 % num2) : num1;
    }

    public static void main(String[] args) {
        System.out.println(greatest_common_divisor(1, 1000000000));
        // System.out.println(euclidean_gcd(1000000, 999999));
    }
}
