import java.util.Scanner;
class Assign3{
   public static void main(String args[]){
              Scanner cs = new Scanner(System.in); 
			  System.out.println("Enter The value of X= "); 
			  int X = cs.nextInt();
			  int Y;
              Y = X*X + 3*X -7;
               System.out.println("1st Expression= "+Y);			  
              Y= X++ + ++X;
			  System.out.println("2nd Expression= "+Y);
 			  int Z;
			  Z = X++ - --Y - --X + X++;
			  System.out.println("3rd Expression= "+Z);
              
			  boolean a = true;
			  boolean b = false;
			  boolean z1 = a && b || !(a||b);
			  System.out.println("4th Expression= "+z1);
   }
} 