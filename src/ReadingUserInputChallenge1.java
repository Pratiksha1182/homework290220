//1. Read 10 numbers from the console entered by the user and print the sum of those numbers.

import java.util.Scanner;

public class ReadingUserInputChallenge1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        int sum = 0;
        while(x <= 10){
            System.out.println(" Enter number #" + x);
            boolean hasNextInt = scanner .hasNextInt();
            x++;
            if (hasNextInt){
                int number = scanner.nextInt();
                sum += number;
            }else{
                System.out.println(" Invalid value ");
            }
            scanner.nextLine();
        }
        System.out.println(" Your sum is : " + sum);
        scanner.close();
    }
}
