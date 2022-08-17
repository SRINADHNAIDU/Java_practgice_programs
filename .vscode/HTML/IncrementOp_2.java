public class IncrementOp_2 {
    public static void main (String[]args){
        int a=30;
        int b=a++;
        int c=++a;
        int d=c++;
        c=40;
         d =c++;
        int f=a+b+c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);

    }
    
}
