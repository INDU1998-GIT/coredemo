import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		
int n;
Scanner s = new Scanner(System.in);
System.out.println("enter a number");
n=s.nextInt();
if(n%2==0)
	System.out.println("it is a even number");
else
	System.out.println("it is odd number");
	}

}
