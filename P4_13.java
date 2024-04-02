class P4_13
{
	public static void main(String[] args) 
	{
		int num1,num2=0 ;
		for (int i=1;i<=4;i++ )
		{
			num1=i+num2;
			num2=num1;
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(num1);
				
						num1--;
						
			}
				System.out.println();
				
				
		}
	}
} 