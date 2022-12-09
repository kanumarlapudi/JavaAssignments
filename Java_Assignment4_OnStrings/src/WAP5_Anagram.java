import java.util.Arrays;

public class WAP5_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "care";
		String s2 = "race";
		
		s1.replace(" " , "");
		s2.replace(" " , "");
		
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("The given strings are anagram");
		}
		else {
			System.out.println("The given strings are not anagram");
		}
		
		for(char ch11:ch1) {
			System.out.print(ch11 + " ");
		}
		
		System.out.println();
		
		for(char ch12:ch2) {
			System.out.print(ch12 + " ");
		}

	}

}
