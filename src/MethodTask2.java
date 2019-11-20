import java.util.Scanner;
public class MethodTask2 {
    public static void main(String[] args){
        System.out.println("enter your radius");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double formel = 2*r*Math.PI;
        System.out.println(formel);
    }
}
