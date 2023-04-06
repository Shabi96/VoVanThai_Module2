package ss4_class_and_oop.bai_tap.stop_watch;

import java.util.Scanner;
public class StopWatchMain {
    public static void main(String[] args) {
        StopWatch testTime = new StopWatch();
        testTime.start();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any");
        String str = sc.nextLine();
        System.out.println(str);
        testTime.stop();
        System.out.println(testTime.getElapsedTime());
    }
}
