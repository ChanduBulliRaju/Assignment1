
public class Program1 {

	public static void main(String[] args) {
		int n=10;
		System.out.println("====================================================================================================");
		System.out.println();
		
		for(int i=0;i<n;i++) // for alphabet I
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || j==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.print("  ");
			

				for(int j=0;j<n;j++)   // for alphabet N
				{
					if(j==0 || i==j || j==n-1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				
				System.out.print("  ");
			
				for(int j=0;j<n;j++)   // for alphabet E
				{
					if(i==0 || j==0 || i==n-1 || i==(n-1)/2 )
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				
				System.out.print("  ");
				
				for(int j=0;j<n;j++)   // for alphabet U
				{
					if(j==0 && i<n-1 || j==n-1 && i<n-1 || i==n-1 && j>0 && j<n-1 )
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				
				System.out.print("  ");
			
			


				for(int j=0;j<n;j++)   // for alphabet R
				{
					if(j==0 || i==0  || j==n-1 && i<(n-1)/2  || i-j==(n-1)/2  || i==(n-1)/2 )
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				
				System.out.print("  ");
				
				for(int j=0;j<n;j++)   // for alphabet O
				{
					if(i==0 && j>0 && j<n-1 || j==0 && i>0 && i<n-1 || i==n-1 && j>0 && j<n-1 || j==n-1 && i>0 && i<n-1 )
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				
				System.out.print("  ");
				
				for(int j=0;j<n;j++)   // for alphabet N
				{
					if(j==0 || i==j || j==n-1 )
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				
				System.out.print("  ");
				
				
				
				
				
			System.out.println();
		}
		
		System.out.println();
		System.out.println("=======================================================================================================");
		

	}

}
