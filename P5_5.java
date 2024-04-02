class P5_5
{
	public static void main(String[] args) 
	{
		int star=-1,space=4, num=0;
		
		for (int i=1;i<=7;i++ )
		{
			if (i<=4)
			{
				star+=2;
				space--;
				num++;
				
			}
			else 
			{
				star-=2;
				space++;
				num--;

			}
			
			
			
			for (int k=1;k<=space ;k++ )
			{
				
				System.out.print(" ");
			}
			for (int j=1;j<=star ;j++ )
			{
				System.out.print(num);
				
			}
			

			System.out.println();
			
		}
	}
}
