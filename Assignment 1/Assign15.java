import java.util.Scanner;
class Assign15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Gender : ");
        char gender = sc.next().charAt(0);
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        if( gender=='f' && age > 18)
            System.out.println("You are eligible for marriage!");
        else if ( gender=='m' && age > 21)
            System.out.println("You are eligible for marriage!");
        else
            System.out.println("You are not eligible for marriage!");
       
    }
}
