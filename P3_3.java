class P3_3 
{
	public static void main(String[] args) 
	{
		char ch='`'; int num=0;
		for (int i=1;i<=4;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				if (j==1 ||j==5)
				{
					ch++;
				System.out.print(ch);
				}
				else if (j==2 ||j==4){
					num++;
				 System.out.print(num);
				}
				else{
					System.out.print('+');
				}
			
			}
				System.out.println();
				
					
		}
	}
}