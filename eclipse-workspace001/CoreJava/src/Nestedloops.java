
public class Nestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nested loops works -
		//for (int i = 1; i <= 4; i++)//(outer for loop) this block will loop for 4times
		//{
			//System.out.println("outer loop stared");//runs 4 times
			//for (int j = 1; j <= 4; j++)//(inner for loop) 
				//{
				//System.out.println("inner loop");//runs 16 times
			//}
			//System.out.println("outer loop finished");// runs 4times
		//}
		int k=1;
		for(int i=0;i<=4;i++)
		{
			//System.out.println("outer loop stared");//runs 4 times
			for (int j = 1; j <= 4-i; j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
				//runs in decreasing order
				//->1st runs 4 times
				//->2nd runs 3 times
				//->3rd runs 2 times
				//->4th runs 1 times
			}
			System.out.println("");// to go to new line
			//System.out.println("outer loop finished");
		}
		int k1=1;
		for(int i=0;i<=4;i++)
		{
			//System.out.println("outer loop stared");//runs 4 times
			for (int j = 1; j <= i; j++)
			{
				System.out.print(k1);
				System.out.print("\t");
				k1++;
				//runs in decreasing order
				//->1st runs 4 times
				//->2nd runs 3 times
				//->3rd runs 2 times
				//->4th runs 1 times
			}
			System.out.println("");// to go to new line
			//System.out.println("outer loop finished");
		}
		
		for(int i=0;i<=4;i++)
		{
			//System.out.println("outer loop stared");//runs 4 times
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j);
				System.out.print("\t");
				//runs in decreasing order
				//->1st runs 4 times
				//->2nd runs 3 times
				//->3rd runs 2 times
				//->4th runs 1 times
			}
			System.out.println("");// to go to new line
			//System.out.println("outer loop finished");
		}
		System.out.println("");
		int k2=3;
		for(int i=0;i<3;i++)
		{
			//System.out.println("outer loop stared");//runs 4 times
			for (int j = 0; j <=i; j++)
			{
				System.out.print(k2);
				System.out.print("\t");
				k2+=3;
				//runs in decreasing order
				//->1st runs 4 times
				//->2nd runs 3 times
				//->3rd runs 2 times
				//->4th runs 1 times
			}
			System.out.println("");// to go to new line
			//System.out.println("outer loop finished");
		}



	}
}
