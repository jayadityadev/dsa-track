package basics.patterns;

/* Pattern 17

        A 
      A B A 
    A B C B A 
  A B C D C B A 
A B C D E D C B A  

*/

public class pattern17 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 'A'; j < i+1+'A'; j++) {
                System.out.print((char)j + " ");
            }
            for (int j = i+'A'; j > 'A'; j--) {
                System.out.print((char)(j-1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}