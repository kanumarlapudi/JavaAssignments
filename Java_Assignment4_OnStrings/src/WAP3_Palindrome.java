import java.util.Scanner;

public class WAP3_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int number2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check palindrome or not:  ");
        int number = sc.nextInt();
        int number1 = number;
        while(number1>0) {
        	a=number1%10;
        	number1 = number1/10;
        	number2 = number2*10+a;
        }
        if(number==number2) {
        	System.out.println("Number is Palindrome ");
        }
        else {
        	System.out.println("Number is not Palindrome ");
        }
        System.out.println(number + " " + number2);

	}

}
