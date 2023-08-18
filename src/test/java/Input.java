import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First number: ");
        int n = input.nextInt();
        System.out.println("Enter Second Number: ");
        int m = input.nextInt();
        System.out.println("First number is: "+n);
        System.out.println("Second Number is: "+m);

        int sum=n+m;
        System.out.println("Addition: "+sum);
        int product=n*m;
        System.out.println("Product: "+product);
        int diff=n-m;
        System.out.println("Difference: "+diff);
        int quotient=n/m;
        System.out.println("division: "+quotient);
        int mod =n%m;
        System.out.println("Remainder: "+mod);
    }
}
