/* Pattern 8

* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 

*/

public class pattern8 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2*(n-i)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}