class P4_10
{
	public static void main(String[] args) 
	{
		int space=-1; int star=6; char ch='e';
		for (int i=1;i<=5;i++ )
		{
			space++;
			star--;
			for (int j=1;j<=space ;j++ )
			{
				
				System.out.print(' ');
			
			}
			for (int j=1;j<=star ;j++ )
			{
				
				System.out.print(ch);
				ch--;
			
			}

				System.out.println();
				ch='e';
				
		}
	}
} 