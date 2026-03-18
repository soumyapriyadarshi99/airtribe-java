public class Employee {
    private String name;
    private int id;
    private double base_salary;

    public Employee(String name, int id, double base_salary) {
        this.name = name;
        this.id = id;
        this.base_salary = base_salary;
    }

    public double calculatePay(){
        return this.base_salary;
    }

    public void displayInfo(){
        System.out.println("name:"+this.name+" "+"id:"+this.id+" "+"salary"+this.base_salary);
    }
}
