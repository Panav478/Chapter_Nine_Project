import javax.swing.JOptionPane;

public class Soccer extends Sports {
   // State
   int goals;
   int assists;
   int passes;
   int touches;
   

   // Constructors
   Soccer(String name, String team, int number, int salary, int goals, int assists, int passes, int touches) {
       super(name, team, number, salary);
       this.goals = goals;
       this.assists = assists;
       this.passes = passes;
       this.touches = touches;
   }

   // Methods - Getters
   int getGoals() {
       return this.goals;
   }
   int getAssists() {
       return this.assists;
   }
   int getPasses() {
       return this.passes;
   }
   int getTouches() {
       return this.touches;
   }

   // Methods - Setters
   void addGoals(int addition) {
       this.goals += addition;
       JOptionPane.showMessageDialog(frame, "Added " + addition + " goals to " + this.name + "'s stats.");
   }
   void addAssists(int addition) {
       this.goals += addition;
       JOptionPane.showMessageDialog(frame, "Added " + addition + " assists to " + this.name + "'s stats.");
   }
   void addPasses(int addition) {
       this.goals += addition;
       JOptionPane.showMessageDialog(frame, "Added " + addition + " passes to " + this.name + "'s stats.");
   }
   void updateTouches(int touches) {
       this.touches = touches;
       JOptionPane.showMessageDialog(frame, "Touches made by " + this.name + " have been recorded.");
   }
}
