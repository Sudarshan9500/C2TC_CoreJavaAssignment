package com.sudarshan.assignment4;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your requirement in CSV format ");
		String input= sc.nextLine();
		String arg[]=input.split(",");
		int m= Integer.parseInt(arg[2]);
		TicketBooking tb= new TicketBooking(arg[0],arg[1],m);
		System.out.println("Enter your mode of payment");
		System.out.println("1 for cash");
		System.out.println("2 for wallet");
		System.out.println("3 for credit card");
		int paymentChoice=sc.nextInt();
		System.out.print("Enter your payment Amount:");
     	double amt=sc.nextDouble();
		if(paymentChoice==1)
		{
         	tb.makePayment(amt);
		}
		else if(paymentChoice==2)
		{
			System.out.print("Enter your wallet number: ");
			String wa=sc.next();
			tb.makePayment(wa, amt);
		}
		else if(paymentChoice==3)
		{
			System.out.print("Enter your Creditcard CCV: ");
			String cv=sc.next();
			tb.makePayment(cv, amt);
		}
		else
		{
		  System.out.println("Invalid choice");
		}

	}

}
