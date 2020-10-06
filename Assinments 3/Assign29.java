class Assign29{
    public static void main(String args[]){
       int a[] = {15,16,17};
       int b[] = {17,18,56,18};
	   int c[] = {52,65,69,69,58};
	   int arr[][] = new int[3][];
	    arr[0] = a;
		arr[1] = b;
		arr[2] = c;
	   int count1=0;
	   int count2=0;
	   for(int ar[]:arr){
		   count1++;
		   for(int e:ar){
			   count2++;
		   }
	   }
	   System.out.println("Total No of arrays: "+count1);
	   System.out.println("Total No of Elements: "+count2);
	}

}