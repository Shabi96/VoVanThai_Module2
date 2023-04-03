package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ShowHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What your's name? ");
        String str = sc.nextLine();
        System.out.println("Hello " + str);
    }
}
