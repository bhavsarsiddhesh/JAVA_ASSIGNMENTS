import java.util.Scanner;
class OneBHK{
     int hallArea;
	 int roomArea;
	 int price;
	 OneBHK(){
		 roomArea = 500;
		 hallArea = 700;
		 price = 450000;
	 }
	 
	 OneBHK(int hallArea,int roomArea,int price){
		 this.hallArea = hallArea;
		 this.roomArea = roomArea;
		 this.price = price;
	 }
	 
	 void show(){
		 System.out.println("===== One BHK =====");
		 System.out.println("hallArea: "+hallArea);
		 System.out.println("roomAreaArea: "+roomArea);
		 System.out.println("price: "+price);
	 }
	 
	 double totalAmount1(){
		double total =((double)(roomArea + hallArea)* (double)price);
		return total;
	}
}

class TwoBHK extends OneBHK{
      int room2Area;
		
		TwoBHK(){
		 roomArea = 500;
		 room2Area= 500;
		 hallArea = 700;
		 price = 450000;
	 }
	 
	 TwoBHK(int hallArea,int roomArea,int room2Area,int price){
		 this.hallArea = hallArea;
		 this.roomArea = roomArea;
		 this.room2Area = room2Area;
		 this.price = price;
	 }
	 
	 void show(){
	 System.out.println("===== TwoBHK =====");
		 System.out.println("hallArea: "+hallArea);
		 System.out.println("roomArea: "+roomArea);
		 System.out.println("room2Area: "+room2Area);
		 System.out.println("price: "+price);
	 }
	 
	 double totalAmount2(){
		double total =((double)(room2Area + roomArea + hallArea)* (double)price);
		return total;
	}

}

class Demo{
	public static void main(String args[]){
	  OneBHK O1 = new OneBHK(400,500,100);
	  O1.show();
	  double s = O1.totalAmount1();
	  System.out.println("Total amount: "+s);
	  TwoBHK T1 = new TwoBHK(700,500,500,80);
	  T1.show();
	  double t = T1.totalAmount2();
	  System.out.println("Total amount: "+t);
	}
}