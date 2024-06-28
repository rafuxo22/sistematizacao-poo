package br.com.mgs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManager {
    private Map<String, Employee> employees = new HashMap<>();

    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public Employee getEmployee(String id) {
        return employees.get(id);
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Get Employee");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter allergies: ");
                String allergies = scanner.nextLine();
                System.out.print("Enter medical conditions: ");
                String medicalConditions = scanner.nextLine();
                System.out.print("Enter contact email: ");
                String contactEmail = scanner.nextLine();
                System.out.print("Enter contact phone: ");
                String contactPhone = scanner.nextLine();

                Employee employee = new Employee(name, id, allergies, medicalConditions, contactEmail, contactPhone);
                manager.addEmployee(employee);
                System.out.println("Employee added successfully!");
            } else if (choice == 2) {
                System.out.print("Enter employee ID: ");
                String id = scanner.nextLine();
                Employee employee = manager.getEmployee(id);
                if (employee != null) {
                    System.out.println(employee);
                } else {
                    System.out.println("Employee not found!");
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
