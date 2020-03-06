//13. Shared Digit

public class Ex13 {
    public static void main(String[] args) {
        Ex13 obj = new Ex13();
        System.out.println(hasSharedDigit(15,55));
    }
    public static boolean hasSharedDigit(int number1,int number2){
        if(number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) return false;
        while(number1 > 0){
            int secondNumber = number2;
            int firstNumber = number1 % 10;
            while (secondNumber > 0 ){
                if(firstNumber == secondNumber% 10){
                    return true;
                }
                secondNumber /= 10;
            }
            number1 /= 10;
        }
        return false;
    }
}


