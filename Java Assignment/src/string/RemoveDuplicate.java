package string;

public class RemoveDuplicate 
{

	public static void main(String[] args) 
	{
		String str =new String( "Welcome to Welcome bike bike ");

		StringBuilder stb = new StringBuilder();

		for (int i=0;i<str.length();i++) 
		{
			if(stb.indexOf(String.valueOf(str.charAt(i)))==-1) 
			{
				stb.append(str.charAt(i));
			}
		}

		System.out.println("Original String : " +str);
		System.out.println("After removing the duplicates : " +stb.toString());

	}

}
