import java.util.Scanner;
class Circle{
		Scanner sc = new Scanner(System.in);
		private int r=0;
		private double A=0; 

        void setdata(int rad,double Area){
			r = rad;
			A = Area;
		}
		int Init(){
		   System.out.print("Enter the Radius: ");
		   r = sc.nextInt();
		   return r;
		}
		double calculateArea(){
             	A = 3.14 * r * r;
                return A;				
		}
		void display(){
		     System.out.print("Area of Circle: "+A);
		}
}

class CircleDemo{
    public static void main(String args[]){
	       Circle c = new Circle();  
	       c.Init();
		   c.calculateArea();
		   c.display();
	}

}