class P5_1
{
	public static void main(String[] args) 
	{
		int star=-1,space=4;
		for (int i=1;i<=4;i++ )
		{
			star+=2;
			space--;
			
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