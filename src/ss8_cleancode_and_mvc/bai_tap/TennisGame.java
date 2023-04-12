package ss8_cleancode_and_mvc.bai_tap;

public class TennisGame {

    public TennisGame() {
    }

    public String getScore(int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return getScoreEqual(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            return getScoreGreaterThan4(player1Score, player2Score);
        } else {
            return getScoreLessThan4(player1Score, player2Score);
        }
    }

    public String getScoreEqual(int number) {
        switch (number) {
            case 0:
                return "Love-All";

            case 1:
                return "Fifteen-All";

            case 2:
                return "Thirty-All";

            case 3:
                return "Forty-All";

            default:
                return "Deuce";
        }
    }

    public String getScoreGreaterThan4(int number1, int number2) {
        int minusResult = number1 - number2;
        if (minusResult == 1) {
            return "Advantage player1";
        } else if (minusResult == -1) {
            return "Advantage player2";
        } else if (minusResult >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    public String getScoreLessThan4(int number1, int number2) {
        String score = "";
        switch (number1) {
            case 0:
                score = "Love";
                break;
            case 1:
                score = "Fifteen";
                break;
            case 2:
                score = "Thirty";
                break;
            case 3:
                score = "Forty";
                break;
        }
        switch (number2) {
            case 0:
                score += " - Love";
                break;
            case 1:
                score += " - Fifteen";
                break;
            case 2:
                score += " - Thirty";
                break;
            case 3:
                score += " - Forty";
                break;
        }
        return score;
    }
}
