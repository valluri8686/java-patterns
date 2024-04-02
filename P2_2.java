class P2_2 
{
	public static void main(String[] args) 
	{
		char ch ='9';
		for (int i=1;i<=4;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				if (i==j || i+j==5)
				{
					
						ch--;
					System.out.print(ch);
					
				}
				
				else 
				{
					System.out.print('*');
				}
			}
				System.out.println();
		}
	}
}