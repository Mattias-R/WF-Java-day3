import java.util.Scanner;
public class MethodTask1 {
    public static void main(String[] args){
        double y = 32;
        double x = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your tempreture");
        int n = sc.nextInt();
        System.out.println("Please enter Fahrenheit or Celsius");
        String f = sc.next();
        f.toLowerCase();
        char b = f.charAt(0);
        double formelCtoF = (x-32)*5/9;
        double formelFtoC = (y * 9/5)+32;

        if(b == 'c'){
            System.out.println(formelCtoF);
        }else if(b == 'f'){
            System.out.println(formelFtoC);
        }else{
            System.out.println("Something went wrong");
        }






    }
}
