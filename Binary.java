import java.util.*;
class Binary{
	public static void main(String args[]){
			
			long a1,b1;
			int i=0, carry =0;
			Scanner sc = new Scanner(System.in);
			int [] sum = new int[10];
			System.out.println("Enter First Binary Number");
			a1 = sc.nextLong();
			System.out.println("Enter Second Binary Number");
			b1 = sc.nextLong();
			sc.close();
			while(a1 != 0 || b1 != 0){
				sum[i++] = (int) ((a1%10 + b1%10 + carry)%2);
				carry = (int) ((a1%10 + b1%10 + carry)/2);
				a1 =a1/10;
				b1=b1/10;
				
			}
				if(carry != 0){
					sum[i++] = carry;
				}
				--i;
				System.out.print("output :  " );
				while(i>=0){
	
				System.out.print(sum[i--]);
				}
				System.out.println("\n");
		
		}
	}