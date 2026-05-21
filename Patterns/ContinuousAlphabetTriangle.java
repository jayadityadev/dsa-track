/* Pattern 14

A 
B C 
D E F 
G H I J 
K L M N O 

*/

public class ContinuousAlphabetTriangle {
    public static void printPattern(int n) {
        int ascii = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print((char)ascii++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
