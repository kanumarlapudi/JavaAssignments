
public class WAP4_ToCountConsonantsVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Harish";
		s = s.toLowerCase();
		int consonants = 0;
		int vowels = 0;
		int numbers = 0;
		int specialCharacters = 0;
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
		    if(ch[i] =='a' || ch[i] =='e' || ch[i] =='i' || ch[i] =='o'	|| ch[i] =='u' ) {
		    	vowels++;
		    }
		    else if(ch[i] >= 'a' && ch[i]<='z') {
		    	consonants++;
		    }
		    else if(ch[i] >= 0 && ch[i] <= 9) {
		    	numbers++;
		    }
		    else {
		    	specialCharacters++;
		    }
		}
		System.out.println("consonants = " + consonants);
		System.out.println("vowels = " + vowels);
		System.out.println("numbers = " + numbers);
		System.out.println("specialCharacters = " + specialCharacters);

	}

}
