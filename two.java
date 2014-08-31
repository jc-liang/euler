public class two
{
	public static void main (String[] args)
	{
		double [] num; 
		num = new double[100]; 

		num[0] = 1; 
		num [1] = 2; 

		for (int x = 2; x < 100; x++) // intialize array position counter 
		{
			num[x] = (num[x-1]) + (num[x-2]); // arithmetic/definition of fibonacci sequence
			
		}

		for (int x = 0; x< 100; x++) // check if fibonacci sequence is created
		{
			//System.out.println(x + ": "+  num[x]);
		
		}	


	
		int sum = 0; // initiate sum


		for (int z = 0;  z< 100; z++) // sum up even numbers
		{
			if (num[z] < 4000000) // if number in position is less than 4 million
			{
				if (num[z] % 2 == 0)  // check if even
				{			
					sum += num[z];
					
				}
				else
				{
					continue;
				}
			}

		}System.out.println(sum);
		
	}
}