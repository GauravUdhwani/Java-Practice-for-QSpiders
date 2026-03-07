class Gaurav 
{
	public static void main(String[] args) 
	{
		char ch = 'A';
		if(((ch >= 'A')&&(ch <= 'Z')) || ((ch >= 'a')&&(ch <= 'z')))
		{
			System.out.println(ch+ " is a alphabet");
		}
		
		else if((ch>='0')&&(ch<='9'))
		{
			System.out.println(ch+ " is a number");
		}
		
		else
		{
			System.out.println(ch+ " is a special character");
		}}
		
}
