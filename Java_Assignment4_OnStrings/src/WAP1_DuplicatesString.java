import java.util.Scanner;

public class WAP1_DuplicatesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String name: ");
		String name = sc.nextLine();
		char ch[] = name.toCharArray();
		System.out.print("After removing the Duplicate characters in given string are: " );
		for(int i=0;i<ch.length;i++) {
			int j;
			for(j=0;j<i;j++) {
				if(ch[i] == ch[j]) {
					break;
				}
			}
			if(j==i) {
				System.out.print(ch[i] + " ");
			}
		}
		

	}

}
