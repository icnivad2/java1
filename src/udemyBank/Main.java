package udemyBank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank joe = new Bank(10001,499,"Joe","343332","joe@mail.com");
		Bank sue = new Bank(10011,10340.34,"Sue","343-2334","sue@mail.com");
		
		
		System.out.println("Account balance: " + sue.getName() + "--"  + sue.getBalance());

		System.out.println("Account balance: " + joe.getName() + "--"  + joe.getBalance());
		
		System.out.println(joe.withdrawal( 300));

	//	System.out.println("Account balance: " + joe.getName() + "--"  + joe.getBalance());
	  System.out.println(joe.withdrawal( 200));

//		System.out.println("Account balance: " + joe.getName() + "--"  + joe.getBalance());

		sue.setName(sue.getName().toUpperCase());
		System.out.println("Account balance: " + sue.getName() + "--"  + sue.getBalance());
	
	}

}
