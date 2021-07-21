package project1;

public class MyClass {

	public static void main(String[] args) {
		//int a, b, c;
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		//Employee emp3=new Employee();
		
		emp1.readData();
		emp2.readData();
		//emp3.readData();
		
		emp1.printData();
		emp2.printData();
		System.out.println(Employee.company);
		
	}

}
