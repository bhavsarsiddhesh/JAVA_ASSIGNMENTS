import java.util.Scanner;
class Assign23{
     public static void main(String args[]){
	  Scanner cs = new Scanner (System.in);
	  System.out.print("No of Value's to be entered: ");
	  int size = cs.nextInt(); 
	  int arr[] = new int[size];
      for(int i=0;i<arr.length;i++){
           System.out.print("Enter the value : ");arr[i]= cs.nextInt();   	  
	  }
	  for(int i=arr.length-1;i>=0;i--){
       System.out.print(arr[i]+" ");       	  
	  }
	 }
}	 
	 