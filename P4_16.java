class P4_16 
{
	public static void main(String[] args) 
	{
		int star=5,space=-1;
		int star2=0;
		for (int i=1;i<=4;i++ )
		{
			star--;
			space++;
			star2++;
			for (int j=1;j<=star ;j++ )
			{
				System.out.print("*");
			}
			for (int k=1;k<=space ;k++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=star2 ;j++ )
			{
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
