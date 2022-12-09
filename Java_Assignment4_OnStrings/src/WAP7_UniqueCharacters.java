
public class WAP7_UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String s = "haris";
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					count++;
				}
			}
		}
		if(count > 0) {
			System.out.println("The Given String is not unique");
		}
		else {
			System.out.println("The Given String is unique");
		}


	}

}
