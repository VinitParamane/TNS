package Assignment;

import java.util.Scanner;

public class String_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		String uppercase="";
		for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)>='A' && s.charAt(i)<='Z'))
				System.out.print(s.charAt(i));
			else
				uppercase=uppercase+s.charAt(i);
		}
        System.out.print(uppercase);
	}

}
