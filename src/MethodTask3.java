import java.util.Scanner;
public class MethodTask3 {
    public static void main(String[] args){
        System.out.println("please enter your first number");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("please enter your second number");
        int n2 = sc.nextInt();
        System.out.println("please enter your third number");
        int n3 = sc.nextInt();

        int formel = (n1+n2+n3)/3;
        System.out.println(formel);
    }
}
