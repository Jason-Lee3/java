import java.lang.reflect.Method;

public class MethodChallenge1 {
    public static void displayHighScorePosition(String pName, int pPosition) {
        System.out.println(pName + " managed to get into position " + pPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int pScore) {
        if (pScore >= 1000) {
            return 1;
        }
        if (pScore >= 500) {
            return 2;
        }
        if (pScore >= 100) {
            return 3;
        }
        return 4;
    }

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

    }
}
