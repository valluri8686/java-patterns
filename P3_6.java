class P3_6
{
	public static void main(String[] args) 
	{
		char ch='{'; int num=0;
		for (int i=1;i<=5;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				 
				 
				 if (j==1 ||j==3){
					 if (i==5 && j==3){
					num=0;
					}
					num++;
				    System.out.print(num);

					
				}
				else{
					ch--;
					System.out.print(ch);
				}
			
			}
				System.out.println();
				
		}
	}
} 

