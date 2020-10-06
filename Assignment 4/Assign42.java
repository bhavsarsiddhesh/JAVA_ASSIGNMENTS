import java.util.Scanner;
class Tile{
	int Side;
	int area=0;
	Scanner sc = new Scanner(System.in);
	void area(){
		int s = sc.nextInt();
		Side = s;
		area = Side*Side;
		System.out.println("Area of Tile: "+area);
	}
}
class Floor extends Tile{
	int length;
	int width;
	int NoOfTiles;
	
	void totalTiles(){
	   int FloorArea=0;
	   System.out.println("Floor Area Should be more than area of tile");
	   int l = sc.nextInt();
	   length =l;
	   int w = sc.nextInt();
	   width = w;
	   FloorArea = length*width;
	   System.out.println("No of Tiles: "+(FloorArea/area));
	}
}
class totalTile{
	public static void main(String args[]){
		Tile t = new Floor();
		Floor f = (Floor)t;
		t.area();
		f.totalTiles();
	}
}