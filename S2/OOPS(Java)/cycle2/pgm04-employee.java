import java.util.Scanner;
class Employee {
	public String eNo;
	public String eName;
	public int eSalary;
	public Employee(String eNo,String eName,int eSalary) {
		this.eNo = eNo;
		this.eName = eName;
		this.eSalary = eSalary;
	}
}
public class mainEmployee {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter count of employee list:");
		int count = Integer.parseInt(scan.nextLine());
		System.out.println();
		Employee[] employees = new Employee[count];
		for(int i=0;i<count;i++)
		{
			System.out.print("Enter number of employee:");
			String eNo = scan.nextLine();
			
			System.out.print("Enter name of employee:");
			String eName = scan.nextLine();
			
			System.out.print("Enter salary of employee:");
			int eSalary = Integer.parseInt(scan.nextLine());
			System.out.println();
			
			employees[i] = new Employee(eNo,eName,eSalary);
		}
		System.out.println("Enter the number of employee to be filtered out:");
		String search = scan.nextLine();
		System.out.println();
		for(int i=0;i<count;i++) {
			if(employees[i].eNo.equals(search)) {
				System.out.println("Employee number:" +employees[i].eNo);
				System.out.println("Employee name:" +employees[i].eName);
				System.out.println("Employee salary:" +employees[i].eSalary);
				}
			}
		}
	}
				