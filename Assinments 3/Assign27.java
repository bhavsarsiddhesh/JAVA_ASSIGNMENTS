
class Assign27{
	public static void main(String args[]){
	int arr[] = new int[]{8,9,1,6,5,6,2,8,4};
	int min=arr[0];
	int max=arr[0];
	/*for(int i=0;i<arr.length;i++){
		if(min>arr[i]){
			min=arr[i];
		}
		max=arr[i];		
	}*/
	for(int a:arr){
		if(min>a){
			min=a;
		}else if(max<a)
		      max=a;	
	}
	System.out.println("Min = "+min);
	System.out.println("Min = "+max);
	}
}