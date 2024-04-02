class Pat14 
{
	public static void main(String[] args) 	{
	for(int i=1;i<=4;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		for(int j=1;j<=6;j-=4){
		  System.out.print(" ");
		}
		for(int j=1;j<=i;j++){
		System.out.print("*");
		}
	System.out.println();
	}
	}
}
