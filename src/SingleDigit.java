import java.util.Scanner;
public class SingleDigit {
	
public static void main(String[] args) {
	int a;
	Scanner s= new Scanner(System.in);
	System.out.println("enter a digit");
	a=s.nextInt();
	if(a>-10 && a<10)
	{
		System.out.println("the entered numbered is single digit");
	}
	else {
		System.out.println("the entered number is not single digit");
}
}
}