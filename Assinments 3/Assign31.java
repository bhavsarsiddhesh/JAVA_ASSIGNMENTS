class Student{
      private int rno;
	  private String name;
	  void setdata(int  rollno, String Stdname){
		   rno = rollno;
		   name = Stdname; 
	  }
	void showData(){
		System.out.println(rno+" "+name);
	}
}
class Assign31{
    public static void main(String args[]){
	    Student s = new Student();// Object creation
		s.setdata(101,"Siddhesh");
		s.setdata(102,"Aditya");
	     s.showData();
	}      
 
}