//Write a program in Java to display the pattern like triangle with a number.

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        TiangleWithNumber();
    }

    public static void TiangleWithNumber() {
        int i, j, n;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);

            System.out.println("");
        }
    }


}


