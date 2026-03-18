/* Pattern 17

A 
B B 
C C C 
D D D D 
E E E E E 

*/

public class pattern17 {
    public static void printPattern(int n) {
        for (int i = 0+65; i < n+65; i++) {
            for (int j = 0+65; j < i+1; j++) {
                System.out.print((char)i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}