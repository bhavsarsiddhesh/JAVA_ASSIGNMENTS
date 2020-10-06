class MathOperation{
     int multilply(int a,int b){
         return a*b;		 
	 }
	 float multilply(double a,double b,double c){
         return a*b*c;		 
	 }
	 
	 int multilply(){
		 int arr[] = {10,12,13,15,16};
		 int Ml=1;
	     for(int i=0;i<arr.length;i++){
			Ml = Ml*arr[i];
	 }
	 return Ml;
}
}

class Assign36{
   public static void main(String args[]){
           int m1,m2,m3;
		   MathOperation m = new MathOperation();
		  m1 = m.multilply(10,2);
		  System.out.println(m1);
		  m2 = m.multilply(float)(3.5F,2.2F,1.3F);
		  System.out.println(m2);
		  m3 = m.multilply();
		  System.out.println(m3);
   }
}