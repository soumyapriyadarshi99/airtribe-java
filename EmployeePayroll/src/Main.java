public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        FullTimeEmployee f1 = new FullTimeEmployee("Rahul", 101, 50000, 10000);
        PartTimeEmployee p1 = new PartTimeEmployee("Amit", 102, 200, 80);

        f1.displayInfo();
        p1.displayInfo();
    }
}