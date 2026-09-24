package model;

public class Tester extends Employee implements Printable {

    private int bugsFixed;
    private double bonusPerBug;

    public Tester(int employeeId, String name, int age, double salary,
                  int bugsFixed, double bonusPerBug) {

        super(employeeId, name, age, salary);
        this.bugsFixed = bugsFixed;
        this.bonusPerBug = bonusPerBug;
    }

    public int getBugsFixed() {
        return bugsFixed;
    }

    public double getBonusPerBug() {
        return bonusPerBug;
    }

    public void setBugsFixed(int bugsFixed) {
        this.bugsFixed = bugsFixed;
    }

    public void setBonusPerBug(double bonusPerBug) {
        this.bonusPerBug = bonusPerBug;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + (bugsFixed * bonusPerBug);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bugs Fixed  : " + bugsFixed);
        System.out.println("Bonus/Bug   : ₹" + bonusPerBug);
        System.out.println("Total Salary: ₹" + calculateSalary());
        System.out.println("--------------------------------");
    }

    @Override
    public void printReport() {
        System.out.println("Tester Report :");
        displayDetails();
    }
}