import java.util.Scanner;

class Student{
	String name;
	int rollno;
	int age;
	int score;
	
	Student(String name,int rollno,int age,int score){
	    this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.score = score;
	}
	
	void display(){
		if(score >= 80 && score <=100){
			System.out.println("Students scored in Between 80-100: "+name+" "+rollno+" "+age+" "+score);
		}else if(score >= 65 && score <80){
			System.out.println("Students scored in Between 65-80: "+name+" "+rollno+" "+age+" "+score);
		}else if(score >= 50 && score <65){
			System.out.println("Students scored in Between 50-80: "+name+" "+rollno+" "+age+" "+score);
		}else if(score >0 && score <100){
			System.out.println("Students scored in Between 0-50: "+name+" "+rollno+" "+age+" "+score);
		}
	}
     
}

class StudentDemo{
		public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
		Student arr[] = new Student[10]; 	
		for(int i=0; i < arr.length ; i++){
			System.out.println("===== Start Record "+i+" =====");
			System.out.print("Enter name: ");
			String name = cs.next();
			System.out.print("Enter Roll no: ");
			int rollno = cs.nextInt();
			System.out.print("Enter age: ");
			int age = cs.nextInt();
			System.out.print("Enter Score: ");
			int score = cs.nextInt();
			System.out.println("===== Record "+i+" End=====");
			Student s = new Student(name,rollno,age,score);
			arr[i] = s;
		}	
			for(Student r : arr){
					r.display();
			}
		}
}