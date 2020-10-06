import java.util.Scanner;
class Assign20{
     public static void main(String args[]){
	  Scanner cs = new Scanner(System.in);
   	  System.out.print("Enter 1st No: ");
	  int X = cs.nextInt();
	  System.out.print("Enter 2nd No: ");
	  int Y = cs.nextInt();
	  int count;
	    for(int i = X ; i <= Y ; i++)
		{
			count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.println(i);
		}
	  
	  }
}