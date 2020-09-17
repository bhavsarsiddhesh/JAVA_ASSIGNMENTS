import java.util.Scanner;
class Sal{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Salary : ");
    float Sal = sc.nextFloat();
    float hra=0;
    float da=0;
    if ( Sal <10000){
        hra = 10*Sal/100;
        da = 90*Sal/100;
    }
    else if( f >= 10000){
        hra = 20000;
        da = 98*Sal/100;
    }

    float Tsal = Sal+hra+da;
    System.out.println("Gross Salary : "+Tsal);
}
}