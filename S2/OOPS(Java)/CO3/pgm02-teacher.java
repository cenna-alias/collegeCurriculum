import java.util.Scanner;

class Employee
{
    int    empId;
    String name;
    double salary;
    String address;

    Employee(int no, String na, double sal, String add)
    {
        this.empId   = no;
        this.name    = na;
        this.salary  = sal;
        this.address = add;
    }
}

public class Teacher extends Employee
{
    String dept;
    String subject;

    Teacher(int no, String na, double sal, String add, String dep, String sub)
    {
        super(no, na, sal, add);
        this.dept    = dep;
        this.subject = sub;
    }

    void display()
    {
        System.out.println("Employee id : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
        System.out.println("Address     : " + address);
        System.out.println("Department  : " + dept);
        System.out.println("Subject     : " + subject);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of employees:");
        int num = sc.nextInt();
        sc.nextLine();

        Teacher[] arr = new Teacher[num];

        for (int i = 0; i < num; i++)
        {
            System.out.println("Enter employee id:");
            int empId = sc.nextInt();

            System.out.println("Enter employee name:");
            String name = sc.next();
            sc.nextLine();

            System.out.println("Enter salary:");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter address:");
            String address = sc.nextLine();

            System.out.println("Enter department:");
            String dept = sc.nextLine();

            System.out.println("Enter subject:");
            String subject = sc.nextLine();

            arr[i] = new Teacher(empId, name, salary, address, dept, subject);
            System.out.println();
        }

        System.out.println("*** Information of all the employees ***");

        for (int i = 0; i < num; i++)
        {
            System.out.println("\n" + (i + 1) + ").");
            arr[i].display();
        }

        sc.close();
    }
}