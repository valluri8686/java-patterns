class P3_1 
{
	public static void main(String[] args) 
	{
		char ch='@'; int num=0;
		for (int i=1;i<=4;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				if (j==1 ||j==3)
				{
					ch++;
				System.out.print(ch);
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