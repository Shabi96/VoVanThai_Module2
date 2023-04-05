package ss3_array.method;

public class ShowFibonacci {
    public static void fibonacci() {
        int number1 = 0;
        int number2 = 1;
        int number3;
        System.out.println(number1);
        System.out.println(number2);
        for (int i = 0; i < 100; i++) {
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
            if(number3 > 100) {
                break;
            }
            System.out.println(number3);
        }
    }
    public static void main(String[] args) {
        fibonacci();
    }
}
