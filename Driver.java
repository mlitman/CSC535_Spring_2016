
public class Driver 
{
	public static void main(String[] args)
	{
		int count = 0;
		for(int i = 1; i <= 1000; i = i + 1)
		{
			if(i % 2 == 0)
			{
				System.out.println("i is even");
				count = count + 1;
			}
			else
			{
				System.out.println("i is odd");
			}
		}
		System.out.println(count);
	}
}
