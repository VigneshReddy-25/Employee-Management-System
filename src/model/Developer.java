package model;

public class Developer extends Employee implements Printable {

    private int overtimeHours;
    private double hourlyRate;

    public Developer(int employeeId, String name, int age, double salary,
                     int overtimeHours, double hourlyRate) {

        super(employeeId, name, age, salary);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + (overtimeHours * hourlyRate);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Overtime Hours : " + overtimeHours);
        System.out.println("Hourly Rate    : ₹" + hourlyRate);
        System.out.println("Total Salary   : ₹" + calculateSalary());
        System.out.println("--------------------------------");
    }

	@Override
	public void printReport() {
		// TODO Auto-generated method stub
		System.out.println("Developer Report: ");
		displayDetails();
	}
}