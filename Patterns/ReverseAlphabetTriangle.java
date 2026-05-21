/* Pattern 19

E 
D E 
C D E 
B C D E 
A B C D E  

*/

public class ReverseAlphabetTriangle {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j < n+1; j++) {
                System.out.print((char)(j+'A'-1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
