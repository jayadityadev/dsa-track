import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindDivisors {

    public static List<Integer> printDivisors(int num) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
                if (i != num / i)
                    divisors.add((int)num/i);
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    public static void main(String[] args) {
        System.out.println(printDivisors(36));
    }
}
