import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter third number:");
        int num3 = sc.nextInt();

        int max;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }

        int min;
        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if (num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }

        System.out.println("Sum of smallest and largest numbers is: ");
        int sum = min + max;
        System.out.println(sum);
        
        sc.close();
    }
}


       
