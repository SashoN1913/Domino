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
		
		System.out.println("Domino Table test");
		System.out.println("-------------------------------------");
		
		DominoTable table = new DominoTable();
		DominoTile tile1 = new DominoTile(2, 2);
		DominoTile tile2 = new DominoTile(5, 2);
		DominoTile tile3 = new DominoTile(2, 4);
		
		table.addLeft(tile1);
		table.addLeft(tile2);
		table.addRight(tile3);
		
		table.print();
		
		
	}

}
