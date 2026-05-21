/* Pattern 16

A B C D E 
A B C D 
A B C 
A B 
A

*/

public class AlphabetInvertedTriangle {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 'A'; j < n-i+'A'; j++) // 'A' = 65
                System.out.print((char)j + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
