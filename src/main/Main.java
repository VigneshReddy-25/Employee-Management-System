package main;

import java.util.Scanner;
import model.*;
import Service.EmployeeService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        int choice;

        do {

            System.out.println("\n========== Employee Management System ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Calculate Payroll");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

            case 1:

                Employee employee;

                System.out.println("\nChoose Employee Type");
                System.out.println("1. Manager");
                System.out.println("2. Developer");
                System.out.println("3. Tester");
                System.out.print("Enter your choice: ");
                int type = sc.nextInt();

                System.out.print("Enter Employee ID: ");
                int employeeId = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                System.out.print("Enter Base Salary: ");
                double salary = sc.nextDouble();

                switch (type) {

                case 1:

                    System.out.print("Enter Bonus: ");
                    double bonus = sc.nextDouble();

                    employee = new Manager(employeeId, name, age, salary, bonus);
                    employeeService.addEmployee(employee);

                    break;

                case 2:

                    System.out.print("Enter Overtime Hours: ");
                    int overtimeHours = sc.nextInt();

                    System.out.print("Enter Hourly Rate: ");
                    double hourlyRate = sc.nextDouble();

                    employee = new Developer(employeeId, name, age, salary,
                            overtimeHours, hourlyRate);

                    employeeService.addEmployee(employee);

                    break;

                case 3:

                    System.out.print("Enter Bugs Fixed: ");
                    int bugsFixed = sc.nextInt();

                    System.out.print("Enter Bonus Per Bug: ");
                    double bonusPerBug = sc.nextDouble();

                    employee = new Tester(employeeId, name, age, salary,
                            bugsFixed, bonusPerBug);

                    employeeService.addEmployee(employee);

                    break;

                default:
                    System.out.println("Invalid Employee Type");
                }

                break;


            case 2:

                employeeService.displayEmployee();

                break;


            case 3:

                System.out.print("Enter Employee ID: ");
                int searchId = sc.nextInt();

                Employee emp = employeeService.searchEmployee(searchId);

                if (emp != null) {
                    emp.displayDetails();
                } else {
                    System.out.println("Employee Not Found.");
                }

                break;


            case 4:

                System.out.print("Enter Employee ID: ");
                int updateId = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter New Name: ");
                String newName = sc.nextLine();

                System.out.print("Enter New Age: ");
                int newAge = sc.nextInt();

                System.out.print("Enter New Salary: ");
                double newSalary = sc.nextDouble();

                boolean updated = employeeService.updateEmployee(
                        updateId,
                        newName,
                        newAge,
                        newSalary);

                if (updated)
                    System.out.println("Employee Updated Successfully.");
                else
                    System.out.println("Employee Not Found.");

                break;


            case 5:

                System.out.print("Enter Employee ID: ");
                int deleteId = sc.nextInt();

                boolean deleted = employeeService.deleteEmployee(deleteId);

                if (deleted)
                    System.out.println("Employee Deleted Successfully.");
                else
                    System.out.println("Employee Not Found.");

                break;


            case 6:

                double totalPayroll = employeeService.calculatePayroll();

                System.out.println("Total Payroll = ₹" + totalPayroll);

                break;


            case 7:

                System.out.println("Thank You!");

                break;

            default:

                System.out.println("Invalid Choice.");

            }

        } while (choice != 7);

        sc.close();
    }
}