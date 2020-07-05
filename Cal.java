	import java.util.Scanner;
	public class Cal{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Tow Numbers : ");
			double first = sc.nextInt();
			double second = sc.nextInt();
			System.out.println("Enter an Operator (+, -, *, /) : ");

			char op = sc.next().charAt(0);
			double result;

			switch(op){
				case '+':
					result = first + second;
					break;

				case '-':
					result = first - second;
					break;

				case '*':
					result = first * second;
					break;

				case '/':
					result = first / second;
					break;

				default:
					System.out.print("Error! Operator is not Correct");
					return;
					
			}
				System.out.printf("%.1f %c %.1f = %.1f", first, op, second, result);
				System.out.print("\n");
				System.out.println("Your Answer is : "+result);
		}
	}