
public class InterviewMinnumber {
	/*2 4 5
	 *3 4 7
	  1 2 9*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][] = {{2,4,5},{3,4,7},{1,2,9}};
		int min = abc[0][0];
		int mincolumn=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)//2
				{
					min = abc[i][j];
					mincolumn =j;//identify the column of minimum number
				}
			}
		}
		int max1 = abc[0][mincolumn];// find the maximum number in identified column
		int k =0;
		while(k<3)
		{
			if(abc[k][mincolumn]>max1)
			{
				max1 =abc[k][mincolumn];
			}
			k++;
		}
		System.out.println(min);// print the least value //output =1
		System.out.println(max1);//print the maximum value in identified column of minimum value  //output =9
		int xyz[][] = {{2,4,5},{3,4,7},{1,2,9}};
		int max = xyz[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(xyz[i][j]>max)//2
				{
					max = xyz[i][j];
				}
			}
		}
		System.out.println(max);// print the least value //output =3
	}
	}
