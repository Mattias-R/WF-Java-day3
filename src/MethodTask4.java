import java.util.Scanner;
public class MethodTask4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your test");
        int points = sc.nextInt();

        if(points >= 90){
            System.out.println("Grade A");
        }else if(points >= 80){
            System.out.println("Grade B");
        }else if(points >= 70){
            System.out.println("Grade C");
        }else if(points >= 60){
            System.out.println("Grade D");
        }else if(points >= 50){
            System.out.println("Grade E");
        }else if(points < 40){
            System.out.println("Grade F");
        }else{
            System.out.println("error");
        }



    }
}
