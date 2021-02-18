import java.util.Scanner;
public class GreatestTwo {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers:");
		a=s.nextInt();
		b=s.nextInt();
		 if(a>b)
		 {
			 System.out.println(a+" is greatest");
			 
		 }
		 else
		 {
			 System.out.println(b+"is greatest");
		 }
	}

}
