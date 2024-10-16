import java.util.*;
public class ProductofTwoNum {
    public static int CalculateProduct(int num1, int num2){
        //int multiplication = num1 * num2;
        return num1*num2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2"); 
        int num2 = sc.nextInt();

                                                               //function call
        System.out.println("Product of num1 and num2 is "+ CalculateProduct(num1, num2));
    }
}
