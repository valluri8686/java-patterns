class P5_7
{
	public static void main(String[] args) 
	{
		int star=9,space=-1, num=0 ,num1=5;
		
		
		for (int i=1;i<=4;i++ )
		{
			star+=2;
			space++;
			num1--;
			
			for (int k=1;k<=space ;k++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=star ;j++ )
			{
				if (j<=num1)
				{
					num++;
				  System.out.print(num);
				  
				}
				else if (num!=1)
				 {
					num--;
					System.out.print(num);
				}
			}
			System.out.println();
			num=0;
		}
	}
}
