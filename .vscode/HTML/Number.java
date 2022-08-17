import java.util.Scanner;
public class Number {
    public static void main(String[]args){
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the number");
       int a=scan.nextInt();
       switch(a){
        case 1:
        System.out.println("tarak");
        break;
        case 2:
        System.out.println("sai");
        break;
        case 3:
        System.out.println("brami");
        break;
        case 4:
        System.out.println("malli");
        break;
        case 5:
        System.out.println("srinad");
        break;
        case 6:
        System.out.println("nanni");
        break;
        default:
        System.out.println("i don't know");
       }
    }
    
}
