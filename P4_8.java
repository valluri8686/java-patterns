class P4_8
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
					System.out.print(num);
				    num++;
				}
				else{
					
					System.out.print(ch);
				    ch++;
				}
			
			}
				System.out.println();
				num=1; ch='a';
				
		}
	}
} 
