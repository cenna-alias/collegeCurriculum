import java.util.Scanner;

class Person {

    String name;
    String gender;
    String address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name    = name;
        this.gender  = gender;
        this.address = address;
        this.age     = age;
    }
}

class Employee extends Person {

    int empId;
    String companyName;
    String qualification;
    long salary;

    Employee(String name, String gender, String address, int age,
             int empId, String companyName, String qualification, long salary) {
        super(name, gender, address, age);
        this.empId         = empId;
        this.companyName   = companyName;
        this.qualification = qualification;
        this.salary        = salary;
    }
}

public class teacher2 extends Employee {

    String subject;
    String department;
    String teacherId;

    teacher2(String name, String gender, String address, int age,
             int empId, String companyName, String qualification, long salary,
             String subject, String department, String teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject    = subject;
        this.department = department;
        this.teacherId  = teacherId;
    }

    void display() {
        System.out.println("Name          : " + name);
        System.out.println("Gender        : " + gender);
        System.out.println("Address       : " + address);
        System.out.println("Age           : " + age);
        System.out.println("Employee ID   : " + empId);
        System.out.println("Company Name  : " + companyName);
        System.out.println("Qualification : " + qualification);
        System.out.println("Salary        : " + salary);
        System.out.println("Subject       : " + subject);
        System.out.println("Department    : " + department);
        System.out.println("Teacher ID    : " + teacherId);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of teachers:");
        int num = sc.nextInt();

        teacher2[] arr = new teacher2[num];

        System.out.println("\nEnter the details of teachers:");

        for (int i = 0; i < num; i++) {

            int x = i + 1;
            System.out.println("\n" + x + ").");

            System.out.println("Name:");
            String name = sc.next();

            System.out.println("Gender:");
            String gender = sc.next();

            System.out.println("Address:");
            String address = sc.next();

            System.out.println("Age:");
            int age = sc.nextInt();

            System.out.println("Employee ID:");
            int empId = sc.nextInt();

            System.out.println("Company Name:");
            String companyName = sc.next();

            System.out.println("Qualification:");
            String qualification = sc.next();

            System.out.println("Salary:");
            long salary = sc.nextLong();

            System.out.println("Subject:");
            String subject = sc.next();

            System.out.println("Department:");
            String department = sc.next();

            System.out.println("Teacher ID:");
            String teacherId = sc.next();

            arr[i] = new teacher2(name, gender, address, age,
                                  empId, companyName, qualification, salary,
                                  subject, department, teacherId);
        }

        System.out.println("\n*** Information of all the Teachers ***");

        for (int i = 0; i < num; i++) {
            int j = i + 1;
            System.out.println("\n" + j + ").");
            arr[i].display();
        }

        sc.close();
    }
}