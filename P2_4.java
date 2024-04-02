class P2_5 
{
	public static void main(String[] args) 
	{
		int num=0;
		for (int i=1;i<=4;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				if (i==3 && j==2)
				{
					i=0;
				}
				else {
					
						num++;
					System.out.print(num);
					
				}
			}
				System.out.println();
				
		}
	}
}