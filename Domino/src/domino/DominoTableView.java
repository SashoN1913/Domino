package domino;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

import javax.swing.JComponent;

public class DominoTableView extends JComponent 
{
	private DominoTable table;
	
	public DominoTableView(DominoTable table)
	{
		this.table = table;
	}
	
	private void paintDominoDots(int left, int right, DominoTile tile, Graphics graphics)
	{
		char[][] pointsAtDomino = tile.createDomino(left, right);
		graphics.setColor(Color.black);
		
		for(int i = 0; i < pointsAtDomino.length; i++)
		{
			for(int j = 0; i < pointsAtDomino.length; j++)
			{
				if(pointsAtDomino[i][j] == '*')
				{
					graphics.fillOval(left, right, 10, 10);
				}
			}
		}
	}
	
	private void paintDomino(Graphics graphics)
	{
		graphics.setColor(Color.orange); //orange because if is white cant see it
		Graphics2D g = (Graphics2D) graphics;
		g.fill3DRect(15, 15, 10, 10, true);
		//Rectangle2D.Double domino = new Rectangle2D.Double(15, 15, 10, 10);
		//domino.fillRect();
	}
	
	@Override
	public void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
				
	}
	
	
}
