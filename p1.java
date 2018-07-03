package helloworld;
import java.util.Scanner;
public class p1 {
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		int x=s.nextInt();
		int s1=0;
		while(x!=0) {
			s1+=x;
			x--;
		}
		System.out.println("result is = " s1);
	}

}

