package domino;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		int left = scan.nextInt();
		int right = scan.nextInt();
		
		DominoTile domino = new DominoTile(left , right);
		
		System.out.println(domino.toString());
		
		
	}

}
