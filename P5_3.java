class P5_3
{
	public static void main(String[] args) 
	{
		int star=-1,space=3;
		for (int i=1;i<=5;i++ )
		{
			if (i<=3)
			{
				star+=2;
				space--;
			}
			else 
			{
				star-=2;
				space++;
			}
			
			
			for (int k=1;k<=space ;k++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=star ;j++ )
			{
				System.out.print("*");
			}
			

			System.out.println();
		}
	}
}
