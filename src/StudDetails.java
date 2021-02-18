import java.util.Scanner;
public class StudDetails {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the student name");
		String name=s.nextLine();
		System.out.println("enter the roll number");
		int rollno = s.nextInt();
		System.out.println("enter the gender");
	String gender= s.next();
	System.out.println("telugu=");
int t=s.nextInt();
System.out.println("hindi=");
int h=s.nextInt();
System.out.println("english=");
int e=s.nextInt();
System.out.println("maths=");
int m=s.nextInt();
System.out.println("science=");
int sc=s.nextInt();
int sum=t+h+e+m+sc;
System.out.println("Total result:" +sum);
int avg=(sum/5);
if(avg>90)
	System.out.println("Distinction");
else if(avg<90 && avg>80)
	System.out.println("pass");
else 
	System.out.println("fail");

		

	}

}
