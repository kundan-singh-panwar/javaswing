import java.util.Scanner;
public class Fac{
	public static void main(String args[]){
		Scanner fc = new Scanner(System.in);
		System.out.print("Enter A number :");
		int num = fc.nextInt();

		int facto =  fact(num);
		System.out.print("factorial is : "+facto);
	
	}
	static int fact(int n){
	int output;
	if(n==1){
	return 1;	
	}
	
	output = fact(n-1)*n;
	return output;
	}
		
}