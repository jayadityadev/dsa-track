package basics.patterns;

/* Pattern 3

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5

*/

public class pattern3 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1 + " ");
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}