package ss8_clean_code_refactoring.bai_tap.refactoring;

public class TennisGame {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;
    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = 0;
        if (scorePlayer1 == scorePlayer2) {
            score = score(scorePlayer1);
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            score = howToWin(scorePlayer1, scorePlayer2);
        } else {
            score = getDraw(scorePlayer1, scorePlayer2, score);
        }
        return score;
    }

    private static String getDraw( int scorePlayer1, int scorePlayer2, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scorePlayer1;
            else {
                score += "-";
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
                case LOVE:
                    score += "Love";
                    break;
                case FIFTEEN:
                    score += "Fifteen";
                    break;
                case THIRTY:
                    score += "Thirty";
                    break;
                case FORTY:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String howToWin(int scorePlayer1, int scorePlayer2) {
        String score;
        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String score(int scorePlayer1) {
        String score;
        switch (scorePlayer1) {
            case LOVE:
                score = "Love-All";
                break;
            case FIFTEEN:
                score = "Fifteen-All";
                break;
            case THIRTY:
                score = "Thirty-All";
                break;
            case FORTY:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
