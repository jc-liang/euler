public class one
{
	public static void main (String[] args)
	{

		int x = 0; 
		for (int y = 0; y < 1000; y++)
		{
			if ((y % 3 == 0) ||(y % 5 ==0))
			{
				x += y; 

			}

		} 

		System.out.println(x);
	}
}