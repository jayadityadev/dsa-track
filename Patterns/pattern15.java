/* Pattern 15

A
A B
A B C
A B C D
A B C D E 

*/

public class pattern15 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 'A'; j < i+1+'A'; j++) // 'A' = 65
                System.out.print((char)j + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}