
import java.util.Scanner;
public class Vowel
{
	public static void main(String[] args)
	{
		char c;
		Scanner s = new Scanner(System.in);
		System.out.println(" enter a alphabet: ");
		 c=s.next().charAt(0);
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
		{
		System.out.println("vowel");
		}
		else
			System.out.println("consonant");
	}
}
