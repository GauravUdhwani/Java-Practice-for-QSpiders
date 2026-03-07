class Student 
{
	public static void main(String[] args) 
	{
		int p = 73;
		
		if((p>=85)&&(p<=100))
		{
			System.out.println("Rank is Distinction");
		}
		
		else if ((p>=65)&&(p<=84))
		{
			System.out.println("Rank is First Class");
		}
		
		else if ((p>50)&&(p<=64))
		{
			System.out.println("Rank is First Class");
		}
		
		else
		{
			System.out.println("Failed");
		}
	}
}
