/* Pattern 12

1                 1 
1 2             2 1 
1 2 3         3 2 1 
1 2 3 4     4 3 2 1 
1 2 3 4 5 5 4 3 2 1

*/

public class NumberMirrorPyramid {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1 + " ");
            }
            for (int j = 0; j < 2*(n-i-1); j++) {
                System.out.print("  ");
            }
            for (int j = i+1; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(2);
    }
}
