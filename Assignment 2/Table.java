import java.util.Scanner;
class Table{
      public static void main(String args[]){
           Scanner cs = new Scanner(System.in);
            System.out.print("Enter Any Number: ");
			int N = cs.nextInt(); 
            for(int i=1;i<=10;i++){
             int A = N*i;
             System.out.println(A);
			}
 }
}