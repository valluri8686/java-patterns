class P3_5
{
	public static void main(String[] args) 
	{
		char ch='`'; int num=0;
		for (int i=1;i<=5;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				if (i==3 )
				{
					System.out.print('+');
				}
				else if (i==1 ||i==5){
					num++;
				    System.out.print(num);
				}
				else{
					ch++;
					System.out.print(ch);
				}
			
			}
				System.out.println();
				num=0;
				ch='`';
					
		}
	}
} 

