import java.util.Scanner;
class Assign10{
  public static void main(String args[]){
       Scanner cs = new Scanner(System.in);
		System.out.print("Enter Tempratuere In Fahrenheit: ");
		float F = cs.nextInt();
		float C = (5*(F -32)/9);
        System.out.printf("Tempratuere In Celcius is:%.3f",C);		
  }
 
}