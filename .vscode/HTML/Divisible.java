import java.util.Scanner;
public class Divisible {
    public static void main(String []args){
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter the numberz");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if ((a>b)&&(a<c)){
            System.out.println("second greatest number"+a);
        }
        else{
            if((b<c)&&(b>a)){
                System.out.println("the greatest number"+b);
            }
            else{
                System.out.println("the second greatest number"+c);
            }
        }
     }
 }
