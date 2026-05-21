/* Pattern 10

* 
* * 
* * * 
* * * * 
* * * * *
* * * * 
* * * 
* * 
* 

*/

public class HalfDiamondPattern {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
