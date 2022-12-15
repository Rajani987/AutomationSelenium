package code;

public class LoopStatementDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=20;
		while(i<=10) // 20<10 -F , 1<10-T,2<10 -T.....9<10 -T, 10<10 -
		{
		System.out.println("*****");
		i++;  // i=i+1;
		}
		//i++; // i=i+1;
		System.out.println(i++); //20, // 21 
		System.out.println(++i); // 21 , 22
		
	}

}
