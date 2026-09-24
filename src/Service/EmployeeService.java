package Service;

import java.util.ArrayList;
import model.Employee;

public class EmployeeService {

	private ArrayList<Employee> employees = new ArrayList<>();
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void displayEmployee() {
		if(employees.isEmpty()) {
			System.out.println("No Employees Found");
			return;
		}
		else {
			for(Employee employee: employees) {
				employee.displayDetails();
			}
		}
	}
	
	public Employee searchEmployee(int employeeId) {
		for(Employee employee:employees) {
			if(employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;
	}
	
	public boolean deleteEmployee(int employeeId) {
		for(Employee employee:employees) {
			if(employee.getEmployeeId()==employeeId) {
				employees.remove(employee);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateEmployee(int employeeId, String name, int age, double salary) {
		Employee employee = searchEmployee(employeeId);
		if(employee != null) {
			employee.setName(name);
			employee.setAge(age);
			employee.setSalary(salary);
			return true;
		}
		return false;
	}
	
	public double calculatePayroll() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.calculateSalary();
        }
        return total;
    }
}
