
import java.util.Scanner;
public class DemoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=1,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		n=s.nextInt();
		while(i<=n)
		{
			sum=sum + i;
			i=i+1;
		}
		System.out.println("sum= "+ sum);

	}

}
