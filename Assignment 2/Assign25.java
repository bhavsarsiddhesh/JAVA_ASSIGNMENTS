class Assign25{
    public static void main(String args[]){
	   int arr[] = {10,13,23,24,30,28,29,31};
	   int even=0;
	   int odd=0;
	   for(int i=0;i<arr.length;i++){
		   if (arr[i]%2 == 0){
			   even = even + arr[i];
		   }else
			   odd = odd + arr[i];
	   }
	   
	   System.out.println("Sum of Elements at Even Positon: "+even);
		 System.out.println("Sum of Elements at Odd Positon:"+odd);
	}

 }
