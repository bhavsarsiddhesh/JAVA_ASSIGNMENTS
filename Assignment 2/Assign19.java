import java.util.Scanner;
class Assign19{
     public static void main(String args[]){
	  Scanner cs = new Scanner(System.in);
	    System.out.println("Enter The Nth Term: "); int N = cs.nextInt();
        int S=12;
		System.out.print("Series: "+S);
		for(int i=1;i<=N;i++){
            S= S + 10;
            System.out.print(" + "+S);			
		}
         		
	  }
}