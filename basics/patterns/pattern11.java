package basics.patterns;

/* Pattern 11

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/

public class pattern11 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                if ((i+j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}