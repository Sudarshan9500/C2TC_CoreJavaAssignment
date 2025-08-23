package com.sudarshan.assignment4;

public class TicketBooking {
	
		private String stageEvent;
		private String customer;
		private int noOfSeats;
		
		public TicketBooking(String stageEvent, String customer, int noOfSeats) {
			super();
			this.stageEvent = stageEvent;
			this.customer = customer;
			this.noOfSeats = noOfSeats;
		}
		public TicketBooking()
		{
			
		}

		public String getStageEvent() {
			return stageEvent;
		}
		public void setStageEvent(String stageEvent) {
			this.stageEvent = stageEvent;
		}
		public String getCustomer() {
			return customer;
		}
		public void setCustomer(String customer) {
			this.customer = customer;
		}
		public int getNoOfSeats() {
			return noOfSeats;
		}
		public void setNoOfSeates(int noOfSeats) {
			this.noOfSeats = noOfSeats;
		}
		
		public void makePayment(Double amount)
		{
		 display();
		 System.out.printf("Amount %.1f paid in cash",amount);
		}
		
		public void makePayment(String walletNumber, Double amount)
		{
			 display();	
			 System.out.printf("Amount %.1f paid using wallet",amount);
			 System.out.println();
			 System.out.println("number "+walletNumber);
		}
		public void makePayment(String creditCard, String ccv, String name, Double amount)
		{
			 display();
			 System.out.printf("Amount %.1f paid using Credit card",amount);
			 System.out.println();
			 System.out.println("CCV: "+ccv);
		}
		public void display()
		{
			System.out.println("Event stage: "+stageEvent);
			System.out.println("Coustomer Name: "+customer);
			System.out.println("No of seats: "+noOfSeats);
		}
		
}
