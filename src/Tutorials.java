import java.lang.*;
import java.util.Scanner;
public class Tutorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for zomato and 2 for Cab ");
		int no=sc.nextInt();
		
		switch(no)
		{
		case 1:
			int amount;
			int code=101;
		    
			System.out.println("Enter the amount");
			amount=sc.nextInt();
			
			System.out.println("Enter the code");
			int encode=sc.nextInt();
			
			System.out.println((encode==code)?"You are given 60% discount":"Enter valid code i.e 101");
			break;
			
		case 2:
			int amountt;
			int req=600;
		    
			System.out.println("Enter the amount");
			amountt=sc.nextInt();
			if(amountt<req)
			{
				System.out.println("You dont have enough money   You should have minimum 500 to travel");
			}
			break;
			
	  	default:
	  		System.out.println("PLease enter valid no.");
	  		break;
			
		}
		
		

	}

}
