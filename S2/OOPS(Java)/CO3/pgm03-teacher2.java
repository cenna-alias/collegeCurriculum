import java.util.Scanner;
class person {
	String name;
	String gender;
	String address;
	int age;
	person(String name,String gender,String address,int age) {
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.age = age;
	}
}

class employee extends person {
	int empid;
	String company_name;
	String qualification;
	long salary;
	employee(String name,String gender,String address,int age,int empid,String company_name,String qualification,long salary) {
		super(name,gender,address,age);
		this.empid = empid;
		this.company_name = company_name;
		this.qualification = qualification;
		this.salary = salary;
	}
}
public class teacher2 extends employee {
	String subject;
	String department;
	String teacher_id;
	teacher2(String name,String gender,String address,int age,int empid,String company_name,String qualification,long salary,String 		subject,String department,String teacher_id) {
		super(name,gender,address,age,empid,company_name,qualification,salary);
		this.subject = subject;
		this.department = department;
		this.teacher_id = teacher_id;
	}
	void display() {
		System.out.println("Name:" +name);
		System.out.println("Gender:" +gender);
		System.out.println("Address:" +address);
		System.out.println("Age:" +age);
		System.out.println("Employee_id:" +empid);
		System.out.println("Company_name:" +company_name);
		System.out.println("Qualification:" +qualification);
		System.out.println("Salary:" +salary);
		System.out.println("Subject:" +subject);
		System.out.println("Department:" +department);
		System.out.println("Teacher_id:" +teacher_id);
	}
	public static void main(String args[]) {
		System.out.println("Enter the no.of teachers:");
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();
		teacher2 arr[] = new teacher2[num];
		System.out.println("\n");
		System.out.println("Enter the details of teachers:");
		int x=0,j=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<num;i++) {
			x=i+1;
			System.out.println("\n"+x+").");
			System.out.println("Name:");
			String a = sc.next();
			System.out.println("Gender:");
			String b = sc.next();
			System.out.println("Address:");
			String c = sc.next();
			System.out.println("Age:");
			int d = sc.nextInt();
			System.out.println("Employee_id:");
			int e = sc.nextInt();
			System.out.println("Company_name:");
			String f = sc.next();
			System.out.println("Qualification:");
			String g = sc.next();
			System.out.println("Salary:");
			long h = sc.nextLong();
			System.out.println("Subject:");
			String k = sc.next();
			System.out.println("Department:");
			String l = sc.next();
			System.out.println("Teacher_id:");
			String n = sc.next();
			arr[i] = new teacher2(a,b,c,d,e,f,g,h,k,l,n);
		}
		sc.close();
		System.out.println("\n *** Information of all the Teachers ***");
		for(int i=0;i<num;i++) {
		j=i+1;
		System.out.println("\n" +j+").");
		arr[i].display();
	}
	sc1.close();
	}
}