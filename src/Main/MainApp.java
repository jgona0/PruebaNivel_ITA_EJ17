package Main;

import paymentStrategy.PaymentStrategy;

public class MainApp {
	
	//Static variables. Fees to add to different payment strategies 
	static double serviceCharge = 5.00;
	static double creditCardFee = 10.00;
	
	
	public static void main(String[] args) {

		double amount = 10;
		
		//Using cash payment way
		PaymentStrategy cashStrategy = cashPayment();
		System.out.println("Using cash, the total amount of money will be: "+ cashStrategy.pay(amount));
		
		
		//Using credit card payment way
		PaymentStrategy creditCardStrategy = creditCardPayment();
		System.out.println("Using credit card, the total amount of money will be: "+ creditCardStrategy.pay(amount));
	} 
	
	
	
	//Method to implement de cash payment strategy implementing the abstract method (pay) through a lambda expression
	public static PaymentStrategy cashPayment() {
		
		PaymentStrategy paymentStrategy = (amount) -> amount+ serviceCharge;
		
		return paymentStrategy;
	
	}
	
	
	
	//Method to implement de credit card payment strategy implementing the abstract method (pay) through a lambda expression
	public static PaymentStrategy creditCardPayment() {
		
		PaymentStrategy paymentStrategy = (amount) -> amount+ serviceCharge + creditCardFee;
		
		return paymentStrategy;
		
	}
	
	
}
