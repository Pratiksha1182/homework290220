import java.util.Scanner;

//Even Digit Sum
public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number:::: ");
        int number = input.nextInt();
        System.out.println("The Sum of Even Digits is:: ");
        System.out.println(getEvenDigitSum(number));
    }

    public static int getEvenDigitSum(int a) {

        int n1 = 0, n2 = 0;
        while (a != 0) {
            n1 = a % 10;

            if ((n1 % 2) == 0)
                n2 += n1 * n1;
            a /= 10;
        }
        return n2;
    }

}



