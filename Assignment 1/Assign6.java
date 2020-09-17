import java.util.Scanner;
class Assign6{
       public static void main(String args[]){
	       Scanner cs = new Scanner(System.in);
		   System.out.print("Enter radius= ");
		   float r = cs.nextFloat();
		   float A = 3.14f * r * r;
		   float C = 2 * 3.14f * r;
		   System.out.println("Area of circle= "+A);
		   System.out.println("Area of circle= "+C);
		   
	   }
}