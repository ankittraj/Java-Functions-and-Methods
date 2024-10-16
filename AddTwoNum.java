import java.util.Scanner;

public class AddTwoNum {
        public static int CalculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2");
        int num2 = sc.nextInt();

        int sum = CalculateSum(num1, num2);//function call
        System.out.println("Sum of num1 and num2 is "+ sum);
    }
}
