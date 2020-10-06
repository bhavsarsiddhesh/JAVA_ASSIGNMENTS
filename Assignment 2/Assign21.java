import java.util.Scanner;
class Assign21{
     public static void main(String args[]){
	  Scanner cs = new Scanner (System.in);
	  System.out.print("No of Value's to be entered: ");
	  int size = cs.nextInt(); 
	  int arr[] = new int[size];
	  int sum=0;
      for(int i=0;i<arr.length;i++){
           System.out.print("Enter the value : ");arr[i]= cs.nextInt();   	  
	  }
	  for(int i=0;i<arr.length;i++){
           sum = sum + arr[i];   	  
	  }
	  System.out.print("Sum is: "+sum);
	 }
}