package program;

public class ReverseStringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abc", revStr="";
		char ch;
		for(int i=0;i<str.length();i++) // i=0; i=1<3- t, 2<3
		{
			ch= str.charAt(i); // a, b , c
			revStr =ch+ revStr; // a, b+a= ba, c+ba
		
		}
		
		System.out.println(revStr);
		
		
		
	}

}
