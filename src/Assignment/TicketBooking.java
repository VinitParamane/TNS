package Assignment;

public class TicketBooking {

	private String stageEvent;
	private String Customer;
	private Integer noOfSeats;
	
	public TicketBooking()
	{
		
	}
	
	public void makePayment(Double amount)
	{
		System.out.println("Stage Event: "+getStageEvent());
		System.out.println("Customer: "+getCustomer());
		System.out.println("Number of seats ; "+getNoOfSeats());
		System.out.println("Amount "+amount+" paid in cash");
		
	}
	
	public void makePayment(String walletNumber,Double amount)
	{
		System.out.println("Stage Event: "+getStageEvent());
		System.out.println("Customer: "+getCustomer());
		System.out.println("Number of seats ; "+getNoOfSeats());
		System.out.println("Amount "+amount+" paid in cash");
		System.out.println("number "+walletNumber);
		
	}
	
	public void makePayment(String creditCard,String ccv,String name,Double amount)
	{
		System.out.println("Stage Event: "+getStageEvent());
		System.out.println("Customer: "+getCustomer());
		System.out.println("Number of seats ; "+getNoOfSeats());
		System.out.println("Holder Name"+name);
		System.out.println("Amount "+amount+" paid in cash");
		System.out.println("CCV "+ccv);
		
	}
	
	
	
	
	
	
	

	public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
		super();
		this.stageEvent = stageEvent;
		Customer = customer;
		this.noOfSeats = noOfSeats;
	}



	public String getStageEvent() {
		return stageEvent;
	}

	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}

	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}

	public Integer getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
}
