class P4_7
{
	public static void main(String[] args) 
	{
		int num=1;char ch='a';
		for (int i=1;i<=4;i++ )
		{
			
			for (int j=1;j<=i ;j++ )
			{
				
				if (i==1 || i==3)
				{
					System.out.print(ch);
				    ch++;
				}
				else{
					System.out.print(num);
				    num++;
				}
			
			}
				System.out.println();
				
		}
	}
} 
