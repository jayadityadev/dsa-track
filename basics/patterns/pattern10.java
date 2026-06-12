package basics.patterns;

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

public class pattern10 {
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