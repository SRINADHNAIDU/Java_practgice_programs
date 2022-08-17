import java.util.Scanner;
public class LeapYear {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the year");
        int a=scan.nextInt();
        if(a%4==0){
            System.out.println("the given year is"+a+" leap year");
        }
        else{
            System.out.println("the given year is "+a+" not leap year");
        }
    }
    
}
