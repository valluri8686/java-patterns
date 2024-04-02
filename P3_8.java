class P3_8
{
	public static void main(String[] args) 
	{
		char ch='A'; int num=1;
		for (int i=1;i<=5;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				if (i==3 || j==3)
				{
					System.out.print('#');
				}
				
				else if (j==1 || j==5)
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
