//7. First And Last Digit Sum

public class Ex7 {
    public static void main(String[] args) {
        System.out.println(sumFirstLast(257));
    }
    public static int sumFirstLast(int number){
        // number = 12 should output 3
        int num = number;
        if(num < 0){
            return -1;
        }
        int lastDigit = num % 10;

        while(num >= 10){
            num = number / 10;
            number = num;
        }
        int firstDigit = num ;

        return firstDigit + lastDigit;
    }
}


