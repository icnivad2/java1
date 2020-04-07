package udemyBank;




public class Bank {
	private double accountNumber ;
	private double balance;
	private String name;
	private String email;
	private String phone;
	
	public Bank(double accountNumber,double balance,String name,String phone,String email) {
		this.setAccountNumber(accountNumber);
		this.setBalance(balance);
		this.setEmail(email);
		this.setPhone(phone);
		this.setName(name);
		
		
	}
	
	public double getAccountNumber(){
		return this.accountNumber;
		
	};
	public void setAccountNumber(double accountNumber){
	   this.accountNumber = accountNumber;  	
	}
	

	public double getBalance() {
		return this.balance;
		
	}
	public void setBalance(double balance) {
		this.balance = balance;
		
	};

	public String getName() {
		return this.name;
		
	};
	public void setName(String name) {
		this.name = name;
	};

	public String getEmail() {
		return this.email;
	};
	public void setEmail(String email) {
		this.email = email;
		
	};

	public String getPhone() {
		return this.phone;
		
	};
	public void setPhone(String phone) {
		this.phone = phone;
	};
 	
	
	public String deposit(double amount) {
	 	  this.balance = this.balance + amount;
           return "Balance is now " + this.balance;
	 		
		}
	public String withdrawal(double amount) {
		if (this.balance - amount >=0) {
		   this.balance = this.balance - amount;
           return "Balance is now " + this.balance;
		}
		
           else
        	    return "Overdraft disallowed " + this.balance + " Withdrawal Amount " + amount;
		 	   
		   
			
		}
		
		
		
	}
	

