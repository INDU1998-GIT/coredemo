import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
				int a,b,res;
				char op;
				Scanner s=new Scanner(System.in);
				System.out.println("enter two numbers: ");
				a=s.nextInt();
				b=s.nextInt();
				System.out.println("enter operator :");
				op= s.next().charAt(0);
				switch(op)
				{
				case '+':
					res=a+b;
					System.out.println("the addition is: " +res);
					break;
					
				case '-':
					res=a-b;
					System.out.println("the subtraction is: "+res);
					break;
				case '*':
				res=a*b;
			System.out.println("multiplication is: " +res);
			break;
				case '/':
					res=a/b;
					System.out.println("division is : "+res);
					break;
			
					default:
						System.out.println("invalid operator");
						break;
				}
				
			}
		
				
						
				 


	}


