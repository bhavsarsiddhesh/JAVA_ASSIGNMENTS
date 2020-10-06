import java.util.Scanner;

class Product{
      int pid;
	  int price;
	  int quantity;
	  
	  Product(int pid,int price, int quantity){
	         this.pid = pid;
			 this.price = price;
			 this.quantity = quantity;
		 }
		 static int calculate(Product arr[]){
		     int amount = 0;
		     int totalamount = 0;   
			for(int i=0; i < arr.length ; i++){
				amount = arr[i].price * arr[i].quantity;
				totalamount = totalamount + amount;
				
				System.out.println("pid: "+arr[i].pid+" amount: "+amount);
			} 
		  return totalamount;
		  }

}

class ProductDemo{
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	Product arr[] = new Product[5];
     
	 for(int i=0; i < arr.length ; i++){
	 System.out.println("Enter Pid: ");	
	 int pid = sc.nextInt();
	 System.out.println("Enter Price: ");	
	 int price = sc.nextInt();
	 System.out.println("Enter Quantity: ");	
	 int quantity = sc.nextInt();
	 
	 Product p = new Product(pid,price,quantity);
	 arr[i] = p;
	 }
         int total = Product.calculate(arr);

		System.out.println("Total Amount = "+total);

    }
}