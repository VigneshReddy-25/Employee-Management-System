package model;

public class Manager extends Employee implements Printable{

    private double bonus;

    public Manager(int employeeId, String name, int age, double salary, double bonus) {
        super(employeeId, name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus       : ₹" + bonus);
        System.out.println("Total Salary: ₹" + calculateSalary());
        System.out.println("--------------------------------");
    }

	@Override
	public void printReport() {
		// TODO Auto-generated method stub
		System.out.println("Manager Report: ");
		displayDetails();
		
		
	}
}