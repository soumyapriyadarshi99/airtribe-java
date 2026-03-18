public class FullTimeEmployee extends Employee{
    private double bonus;

    public FullTimeEmployee(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);  // calling parent constructor
        this.bonus = bonus;
    }

    public double calculatePay() {
        return super.calculatePay() + bonus;
    }
}
