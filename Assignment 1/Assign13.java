import java.util.Scanner;
    class Assign13{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
			
			if(a > b && a > c )
			{
				System.out.println("Gretest Number : "+a);
			}else if(b > a && b > a )
			 {
			    System.out.println("Gretest Number : "+b); 	
			 }else{
				 System.out.println("Gretest Number : "+c);
			 }
			 
            int d = (a > b)?( (a>c ? a : c) ):( (b > c) ? b : c);
            System.out.println("Gretest Number : "+d); 
        }
    }