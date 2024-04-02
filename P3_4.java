class P3_4
{
	public static void main(String[] args) 
	{
		char ch='`'; int num=0;
		for (int i=1;i<=5;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				if (i==5 && j==3)
				{
					System.out.print('+');
				}
				else if (j==2 ||j==4){
					num++;
				    System.out.print(num);
				}
				else{
					ch++;
					System.out.print(ch);
				}
			
			}
				System.out.println();
				if (i==4)
				{
					ch='h';
				}
				
					
		}
	}
}