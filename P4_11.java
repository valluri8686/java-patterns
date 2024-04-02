class P4_11
{
	public static void main(String[] args) 
	{
		 int star=6; int num=5; char ch='a';
		for (int i=1;i<=5;i++ )
		{
			
			star--;
			
			for (int j=1;j<=star ;j++ )
			{
				
				if (i%2!=0)
				{
					System.out.print(num);
					num--;
				}
				else {
					System.out.print(ch);
					ch++;
				}
			
			}

				System.out.println();
				num = 5; ch = 'a';
				
		}
	}
} 
