package helloworld;

import java.util.Scanner;

public class p2 {
	public static void main(String args[])
	{
		System.out.println("enter the input");
		Scanner s = new Scanner (System.in);
		int x= s.nextInt();
		int y= s.nextInt();
		System.out.println("enter the operation to be performed");
		String oper= s.next();
		switch(oper)
		{
		case "+": System.out.println("result is"+ (x+y));
		break;
		case "-": System.out.println("result is"+ (x-y));
		break;
		case "*": System.out.println("result is"+ (x*y)+(x+y));
		break;
	
		case "/": 
			if(y==0)
				System.out.println("cannot perform");
		else
			System.out.println("result is"+ (x/y));
		break;
		default:
			System.out.println("no match");
		}
		
	}

}
