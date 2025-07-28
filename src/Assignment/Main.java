package Assignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String [] input=s.split(",");
		int a=sc.nextInt();
		if(a==1)
		{
			Double amount=sc.nextDouble();
			TicketBooking obj=new TicketBooking(input[0],input[1],Integer.parseInt(input[2]));
			obj.makePayment(amount);
			
			
			
		}
		else if(a==2)
		{
			Double amount=sc.nextDouble();
			String walletNumber=sc.nextLine();
			TicketBooking obj=new TicketBooking(input[0],input[1],Integer.parseInt(input[2]));
			obj.makePayment(walletNumber,amount);
			
			
		}
		else if(a==3)
		{
			String Name=sc.nextLine();
			Double amount=sc.nextDouble();
			String card=sc.nextLine();
			String cardNumber=sc.nextLine();
			
			
			TicketBooking obj=new TicketBooking(input[0],input[1],Integer.parseInt(input[2]));
			obj.makePayment(card,(cardNumber),Name,amount);
			
			
			
		}
		else
		{
			System.out.println("Invalid choice");
		}
		
		
		
	}

}
