import java.util.Scanner;
class Assign7{
       public static void main(String args[]){
	     Scanner cs = new Scanner(System.in);
         System.out.print("Subject 1= ");
         int S1 = cs.nextInt();
		 System.out.print("Subject 2= ");
         int S2 = cs.nextInt();
		 System.out.print("Subject 3= ");
         int S3 = cs.nextInt();
		 System.out.print("Subject 4= ");
         int S4 = cs.nextInt();
		 System.out.print("Subject 5= ");
         int S5 = cs.nextInt();
		 float Per = (float)(((S1+S2+S3+S4+S5)/(500.00))*100.00);
		 System.out.print("Percentage Marks = "+Per);
	   }
	   
}