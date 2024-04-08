import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;
    String address;

    Employee(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

public class Teacher extends Employee {
    String department;
    String subject;

    Teacher(int empId, String name, double salary, String address, String department, String subject) {
        super(empId, name, salary, address);
        this.department = department;
        this.subject = subject;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MERIN MAGI TELSON      23MCA043    02/04/24 ");
        System.out.println("Enter the number of Employees:");
        int numEmployees = scanner.nextInt();
        Teacher[] employees = new Teacher[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter Employee ID:");
            int empId = scanner.nextInt();
            System.out.println("Enter Employee Name:");
            String name = scanner.next();
            System.out.println("Enter Salary:");
            double salary = scanner.nextDouble();
            System.out.println("Enter Address:");
            String address = scanner.next();
            System.out.println("Enter Department:");
            String department = scanner.next();
            System.out.println("Enter Subject:");
            String subject = scanner.next();
            employees[i] = new Teacher(empId, name, salary, address, department, subject);
            System.out.println();
        }

        System.out.println("******** Information of all Employees ************");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println((i + 1) + ".");
            employees[i].display();
        }

        scanner.close();
    }
}

