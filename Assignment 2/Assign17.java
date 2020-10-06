import java.util.Scanner;
class Reverse{
     public static void main(String args[]){
	  Scanner cs = new Scanner(System.in);
	  System.out.println("Enter any Number: ");
	  int a = cs.nextInt();
	  int b;
	  int rev=0;
	  while(a != 0 )
	  {
		  b = a%10;
          rev = rev * 10 + b;
          a= a/10; 		  
	  }
	  System.out.println("Reversed Number: "+rev);
	 }
}