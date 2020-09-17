import java.util.Scanner;
    class Assign14{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();
            if (year%100 !=0 && year%4 == 0 || year%400 == 0)
                System.out.println(year+" is Leap Year ");
            else
                System.out.println(year+" is Not A leap Year ");
        }
    }