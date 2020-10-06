import java.util.Scanner;
class Assign28{
    public static void main(String args[]){
	    Scanner cs = new Scanner (System.in);
		
		
		System.out.println("Enter No of Elements: ");
		int N = cs.nextInt();
		String arr[] = new String [N];
		
        for(int i=0; i<arr.length; i++){
			System.out.println("Enter Names: ");
			 arr[i] = cs.next(); 
		}		
          for(String a:arr){
			  System.out.print(" "+a);
		  }		
	}	
}