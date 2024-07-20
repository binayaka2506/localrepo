package atm.i;
import java.util.Scanner;

public class AtmMachine 
{
	static Scanner sc =new Scanner(System.in);
	static int pin=1234;
	static int balance;
	 void menu()
	{
		while(true)
		{
		System.out.println("1.view balance");
		System.out.println("2.deposit amount");
		System.out.println("3.Withdrawl ammount");
		System.out.println("4.change pin");
		System.out.println("5.exit");
		
		System.out.println("enter ur choice:");
		int k=sc.nextInt();
		switch(k)
		{
		case 1:
		{
			this.display_balance();
	
			break;
		}
		case 2:
		{
			this.add_amount();
			System.out.println("amount deposit sucessfully");
			break;
		}
		case 3:
		{
			withdraw_amt();
			break;
		}
		case 5:
		{
			System.out.println("thank you for using this service");
			System.exit(0);
			
			
		}
		case 4:
		{
			System.out.println("enter the new pin");
			pin=sc.nextInt();
			System.out.println("pin changed sucessfully");
			break;
		}
		default:
			System.out.println("invalid input");
			System.out.println("please make the correct choice");
		
		}
		}
	}
	
	public void display_balance()
	{
		System.out.println("the avaliable balance is:"+balance);
	}
	void add_amount()
	{
		System.out.println("enter the amount to be deposit:");
		int b=sc.nextInt();
		balance=b+balance;
	}
	void withdraw_amt()
	{
		System.out.println("enter the amount to be withdrawn:");
		int w=sc.nextInt();
		if(balance>w)
		{
			System.out.println("withdraw is sucessful"+
		"and remaning balance is"+(balance-w));
			balance=balance-w;
		}
		else
			System.out.println("not having sufficient balance");
	}
	
	public static void main(String[]args)
	{
		System.out.println("!!!! Welcome to the atm managment system!!!");
		System.out.println("please enter ur pin");
		int p=sc.nextInt();
		AtmMachine obj=new AtmMachine();
		int num=1;
		
		if(p==pin)
		{
			obj.menu();
			
		}
		else
		{
				System.out.println("invalid pin");

			
		}
	
			
	  
		
		
	}
	

}
