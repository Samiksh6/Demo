import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc=new Scanner(System.in);
				int num;
				System.out.print("Enter one Number : ");
				num=sc.nextInt();
				
				if(num%2==0)
					System.out.print("Number is Even..");
				else
					System.out.print("Number is Odd..");
				sc.close();
			}

		}


