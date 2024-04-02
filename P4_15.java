class P4_15 
{
	public static void main(String[] args) 
	{
		int star=0,space=4;
		for (int i=1;i<=4;i++ )
		{
			star++;
			space--;
			for (int j=1;j<=star ;j++ )
			{
				System.out.print("*");
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
