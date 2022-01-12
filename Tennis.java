import javax.swing.JOptionPane;

public class Tennis extends Sports {
    // State
    int gamesWon;
    int matchTime;
    int pointsWon;

    // Constructors
    Tennis(String name, String team, int number, int salary, int gamesWon, int matchTime, int pointsWon) {
        super(name, team, number, salary);
        this.gamesWon = gamesWon;
        this.matchTime = matchTime;
        this.pointsWon = pointsWon;
    }
    // Methods - Getters
    int getGamesWon() {
        return gamesWon;
    }
    int getPointsWon() {
        return pointsWon;
    }
        
    // Methods - Setters
    void addGamesWon() {
        gamesWon++;
    }
    void updateMatchTime(int newMatchTime) {
        this.matchTime = newMatchTime;
        JOptionPane.showMessageDialog(frame, "Match time has been updated.");
    }
    boolean GoodServe(String[] arr, Double goodRate) {
        int hitcounter = 0;
        boolean isGoodServe;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("hit")) {
                hitcounter++;
            }
        }
        if ((hitcounter/arr.length) >= goodRate) {
            isGoodServe = true;
        }
        else {
            isGoodServe = false;
        }
        return isGoodServe;
    }
}
