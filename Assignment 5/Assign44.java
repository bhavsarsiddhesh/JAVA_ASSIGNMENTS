import java.util.Scanner;

class Faculty{
     
	 int facultyid ;
	 double salary;
	 Faculty(){
		 salary=0;
	 }
	 
	 Scanner sc = new Scanner(System.in);
	 void input(){
	      System.out.println("Enter Faculty Id: ");
		  int fid = sc.nextInt();
	 }
	 double printSalary(){
		 this.salary = salary;
		 return salary;
	 }
}

class FullTimeFaculty extends Faculty{
		int basicSalary;
		int allowance;
		
		Scanner sc = new Scanner(System.in);
		void input(){
			System.out.print("Enter Basic Salary: ");
			int s = sc.nextInt();
			basicSalary = s;
			System.out.print("Enter Allowance: ");
			int ss = sc.nextInt();
			allowance = ss;
		}
		void salary(){
			int NetSalary;
			NetSalary = basicSalary + allowance;
			System.out.println("Net Salary of Full Time Faculty: "+NetSalary);
		}
		
}

class PartTimeFaculty extends Faculty{
		double workingHours;
		double ratePerHour;
		Scanner sc = new Scanner(System.in);
		void input(){
			System.out.print("Enter Working Hours: ");
			double s = sc.nextDouble();
			workingHours = s;
			System.out.print("Enter Rate Per Hour: ");
			double ss = sc.nextDouble();
			ratePerHour = ss;
		}
		void salary1(){
			double parttimesalary=0;
			parttimesalary = (workingHours * ratePerHour);
			System.out.println("Part time Salary: "+parttimesalary);
		}
}

class main{
	public static void main(String args[]){
			FullTimeFaculty FTF = new FullTimeFaculty();
            System.out.println("==== Full Time Faculty ====");
			FTF.input();
		    FTF.salary();
			System.out.println("==== Part Time Faculty ====");
			PartTimeFaculty PTF = new PartTimeFaculty();
			PTF.input();
			PTF.salary1();
	}
}