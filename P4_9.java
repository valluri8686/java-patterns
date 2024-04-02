class P4_9
{
	public static void main(String[] args) 
	{
		int num=1;char ch='a';
		for (int i=1;i<=4;i++ )
		{
			
			for (int j=1;j<=i ;j++ )
			{
				
				if (j==1 || j==3)
				{
					System.out.print(num);
				    num++;
				}
				else{
					
					System.out.print(ch);
				    ch++;
				}
			
			}
				System.out.println();
				
		}
	}
} 
