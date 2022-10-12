package string;

public class CompareString 
{

	public static void main(String[] args) 
	{
		String s="Dinakar";
		String s1="Ashwin";
		String s2="Karthick";
		System.out.println("Compare the strings");
		System.out.println(s.compareTo(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s.compareToIgnoreCase(s1));
	}

}
