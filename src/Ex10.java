//10. Write a program to input any number and check if it Armstrong number or not

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Ex10 obj = new Ex10();
        main1();
    }

    public static void main1() {
        int num = 0, originalNum, remainder, result = 0;
        System.out.println("Enter a three-digit integer: ");
        Scanner s=new Scanner(System.in);
        num = s.nextInt();
        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += remainder * remainder * remainder;
            originalNum /= 10;
        }

        if (result == num) {
            System.out.println(num+" is an Armstrong number.");
            //return 1;
        } else {
            System.out.println(num+" is not an Armstrong number.");

            //return 0;
        }
    }
}


