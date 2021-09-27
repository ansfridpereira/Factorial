import java.util.Scanner;
class Armstrong{
    public static void main(String args[]) {
        int number;
        int temp, a, b = 0;
        System.out.println("Enter the number to be verified:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        temp = number;
        while(temp != 0) {
            a = temp % 10;
            b = b + (a * a * a);
            temp = temp / 10;
        }
        if(b == number)
            System.out.println("Given number is an armstrong number.");
        else
            System.out.println("Given number is not an armstrong number.");
    }
}