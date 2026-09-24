package model;

public abstract class Employee {

    private int employeeId;
    private String name;
    private int age;
    private double salary;

    public Employee(int employeeId, String name, int age, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Concrete Method
    public void displayDetails() {
        System.out.println("--------------------------------");
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Base Salary : ₹" + salary);
    }

    // Abstract Method
    public abstract double calculateSalary();
}