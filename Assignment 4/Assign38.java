class Employee{
    static int empNo = 0;
	int salary;
	static int totalsalary = 0;
	
	Employee(int salary){
	    empNo++;
		this.salary = salary;
		totalsalary = totalsalary + salary; 
	}
	
	void display(){
		System.out.println("Number of Employees:"+" "+empNo+" Total Salary: "+totalsalary);
	}
}

class EmployeeDemo{
     public static void main(String args[]){
		Employee E1 = new Employee(5600);
		E1.display();
		Employee E2 = new Employee(4500);
		E2.display();
		
	 }
}