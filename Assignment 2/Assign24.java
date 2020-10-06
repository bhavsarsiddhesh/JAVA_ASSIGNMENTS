import java.util.Scanner;
class Assign24{
     public static void main(String args[]){
	  Scanner cs = new Scanner (System.in);
	  System.out.print("No of Value's to be entered: ");
	  int size = cs.nextInt(); 
	  int arr[] = new int[size];
      int i,j=0;
	  for(i=0;i<arr.length;i++){
           System.out.print("Enter the value : ");arr[i]= cs.nextInt();   	  
	  }
	  System.out.println("Enter Search Element: ");
	  int search = cs.nextInt();
	  for(i=0;i<arr.length;i++){
		  if(search == arr[i]){
			  System.out.println("yes,"+search+" is in the array");
			  j=1;
			  break;
		  }
	  }     	   
	   if(i==5 && j!=1){
		   System.out.println("Element is Not present in the Array");
	   }
	}
}