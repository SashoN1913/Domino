package domino;

import java.awt.BorderLayout;
import java.util.Scanner;

import javax.swing.JFrame;

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
		
		//table.addLeft(tile1);
	//	table.addLeft(tile2);
		table.addRight(tile3);
		
		table.print();
		
		/*
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(50, 50, 800, 500);
		f.setLayout(new BorderLayout());
		
		DominoTableView d = new DominoTableView(table);

		f.add(d, BorderLayout.CENTER);
		f.setVisible(true);
		//d.paintComponents(g);
		*/
	}

}
