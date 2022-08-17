import java.util.Scanner;

//import javax.lang.model.util.ElementScanner14;
public class srinadh{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1);
        }
        else if(num2>num3){
            System.out.println(num2);
        }
        else
        {
            System.out.println(num3);
        }
    }
}

