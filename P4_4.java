class P4_4
{
	public static void main(String[] args) 
	{
		int space=4; int star=0;
		for (int i=1;i<=4;i++ )
		{
			space--;
			star++;
			for (int j=1;j<=space ;j++ )
			{
				
				System.out.print(' ');
			
			}
			for (int j=1;j<=star ;j++ )
			{
				
				System.out.print('*');
			
			}
			System.out.println();
				
		}
	}
} 