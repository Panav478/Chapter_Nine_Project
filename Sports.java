public class Main {
    public static void main(String[] args) {
        // Testing Program
        Soccer ronaldo = new Soccer("Christano Ronaldo", "Argentina National Football Team", 10, 30000000, 5, 20, 45, 250);
        System.out.println(ronaldo.salary);
        ronaldo.updateSalary(41000000);
        
    }
}
