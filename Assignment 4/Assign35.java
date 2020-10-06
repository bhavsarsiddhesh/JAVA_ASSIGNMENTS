import java.util.Scanner;
import java.lang.Math;
class MathOperation{
    static void add(int a,int b){
			System.out.println("Addition is: "+(a+b));
	}
	static void subtract(int a,int b){
		System.out.println("Substraction is: "+(a-b));
	}
	static void multiply(int a, int b){
		System.out.println("Multiplication is: "+(a*b));
	}
	static void power(int a, int b){
		System.out.println(""+Math.pow(a,b));
	}
}
class Assign35{
      public static void main(String args[]){
	    int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First No: ");
		i = sc.nextInt();
		System.out.println("Enter Second No: ");
		j = sc.nextInt();
		MathOperation.add(i,j);
		MathOperation.subtract(i,j);
		MathOperation.multiply(i,j);
		MathOperation.power(i,j);
	  }
}