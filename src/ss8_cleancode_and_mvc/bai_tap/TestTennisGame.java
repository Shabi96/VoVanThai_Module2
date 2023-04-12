package ss8_cleancode_and_mvc.bai_tap;

import java.util.Scanner;

public class TestTennisGame {
    public static void main(String[] args) {
        TennisGame tennisGame = new TennisGame();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player1 score: ");
        int player1Score = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter player2 score: ");
        int player2Score = Integer.parseInt(scanner.nextLine());
        System.out.println(tennisGame.getScore(player1Score,player2Score));
    }
}
