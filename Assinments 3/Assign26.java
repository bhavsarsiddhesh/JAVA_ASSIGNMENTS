class Assign26{
    public static void main(String args[]){
        int a[] = {45,43,20,56};
		int b[] = {47,48,45,46};
		int c[] = {28,15,56,47,48};
		int d[] = {10,20,40,50};
		int e[] = {40,30,20,10};
		
		int arr[][] = new int[5][];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		arr[4] = e;
		int sum=0;
		for(int ar[] : arr){
			for(int arrr :ar)
				sum = sum + arrr;
		}
	   System.out.print(" "+sum); 
	}

}