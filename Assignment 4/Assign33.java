class Sample{
int EmpId;
String Empname;
  void set(int EmpId,String Empname){
      System.out.println("this: "+this);
	  this.EmpId = EmpId;
	  this.Empname = Empname;
  }
   void display(){
	    System.out.println(EmpId+" "+Empname);
   }
}

class Assign33{
		public static void main(String args[]){
		      Sample s = new Sample();
			  System.out.println("Intance s: "+s);
			  s.set(11,"Siddhesh");
			  s.display();
		}
}