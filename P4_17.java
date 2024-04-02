class P4_17
{
	public static void main(String[] args) 
	{
		int star=5,space=5;
		int star2=0;
		for (int i=1;i<=4;i++ )
		{
			star--;
			space--;
			star2++;
			for (int j=1;j<=star2 ;j++ )
			{
				if (i==4 && j==1)
				{
					System.out.print(" *");
				}
				else {
				System.out.print("*");
				}
			}
			for (int k=1;k<=space ;k++ )
			{
				if (i==4 && k==1)
				{
					System.out.print("");
				}
				else {
				System.out.print(" ");
				}
			}
			
			for (int j=1;j<=star ;j++ )
			{
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
