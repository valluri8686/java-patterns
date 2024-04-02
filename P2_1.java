class P2_1 
{
	public static void main(String[] args) 
	{
		char ch ='`';
		for (int i=1;i<=5;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				if (i==j || i+j==6)
				{
					if (ch=='d')
					{
						ch++;
						ch++;
					System.out.print(ch);
					}
					else {
						ch++;
					System.out.print(ch);
					}
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