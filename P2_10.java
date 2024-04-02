class P2_10 
{
	public static void main(String[] args) 
	{
		char ch='`'; int num=0;
		for (int i=1;i<=4;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				if (i==1 ||i==3)
				{
					num++;
				System.out.print(num);
				}
				else {
					ch++;
				 System.out.print(ch);
				}
			
			}
				System.out.println();
				
					
		}
	}
}