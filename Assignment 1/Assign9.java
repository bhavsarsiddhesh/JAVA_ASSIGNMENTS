import java.util.Scanner;
class Assign9{
     public static void main(String args[]){
	   Scanner cs = new Scanner(System.in);
	   System.out.print("Enter days = ");
	   int Days = cs.nextInt();
	    int year = 0;
	    int Days1;
		int Months=0,Months1;
        while(true){	
		if( Days > 365)
		{
		 Days = Days - 365;
			year++;
			if(Days < 365){
				Months = Days/30;
				Months1 = Days%30;
				if(Months1 > 30)
				{
					Months1++;
				}else{
			     	break;
				}
			}
		}else if(Days < 365)
		    Months = Days/30;
				Months1 = Days%30;
				if(Months1 > 30)
				{
					Months1++;
				}else{
			     	break;
				}
		}
		
        System.out.print(year+" Year "+Months+" Months "+Months1+" days");	  
	 }
 }