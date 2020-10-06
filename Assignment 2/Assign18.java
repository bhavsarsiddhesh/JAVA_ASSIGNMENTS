import java.util.Scanner;
class Assign18{
       public static void main(String args[]){
              Scanner sc = new Scanner(System.in);
              System.out.print("enter the number= ");
              int a = sc.nextInt();
              if(a==0 || a==1 || a==2)
              System.out.print("not a prime number= ");
        }else{
          for(int i=2;i<=a/2;i++)
          if(a%i==0)
          {
            System.out.print("Not a prime");
            break;

           }
          else {
             if(i==a/2)
             System.out.print("prime");
             else
             continue;
            }

          }
       }
    }