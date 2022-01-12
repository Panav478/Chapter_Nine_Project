import javax.swing.JOptionPane;

public class Basketball extends Sports {
    // State
    String effectiveFieldGoalPercentage;
    String trueShootingPercentage;

    // Constructors
    Basketball(String name, String team, int number, int salary) {
        super(name, team, number, salary);
    }

    // Methods - Getters
    String getEFG() {
        return effectiveFieldGoalPercentage;
    }
    String getTS() {
        return trueShootingPercentage;
    }
    
    // Methods - Setters
    void calculateEFG(int fieldGoals, int threePointShots, int fieldGoalsAttempted) {
        effectiveFieldGoalPercentage = (fieldGoals + (0.5 * threePointShots)) / fieldGoalsAttempted + "%";
        JOptionPane.showMessageDialog(frame, "EFG percentage has been calculated.");
    }
    void calculateTS(int pointsScored, int fieldGoalAttempts, int freeThrowAttempts) {
        trueShootingPercentage = pointsScored / 2 * (fieldGoalAttempts + (0.44 * freeThrowAttempts)) + "%";
        JOptionPane.showMessageDialog(frame, "TS percentage has been calculated.");
    }
}
