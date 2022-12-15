// find the max from the array

package program;

public class ArrayDemoProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks[] = new int[5];
		marks[0]= 10;
		marks[1]= 12;
		marks[2]= 20;
		marks[3]= 15;
		marks[4]= 13;
		int max= 0;
	for(int i=0;i<=4;i++) //  4<4 - f
	{
		if(max<marks[i]) // 10<12 - t, 12<20 - t, 20<15 - f, 20<13 - f
		{
			max = marks[i]; // 12, 20, 
		}
		
	}
	System.out.println("max = "+ max);
	
		
		
		int a[] = {10,20,30};
//		for(int i=0;i <=2 ; i++)
//		{
//		System.out.println(a[i]);
//		}
		
		
		
		
	}

}
