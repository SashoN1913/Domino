package domino;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.Iterator;

import javax.swing.JComponent;

public class DominoTableView extends JComponent 
{
	private DominoTable table;
	
	public DominoTableView(DominoTable table)
	{
		this.table = table;
	}
	
	private void paintDominoDots(Rectangle rect, DominoTile tile, Graphics graphics)
	{
		char[][] pointsAtDomino = tile.createDomino(rect.x, rect.y);
		graphics.setColor(Color.black);
		//Rectangle rect1 = new Rectangle(rect.x, rect.y);
		for(int i = 0; i < pointsAtDomino.length; i++)
		{
			for(int j = 0; i < pointsAtDomino[i].length; j++)
			{
				if(pointsAtDomino[i][j] == '*')
				{
					graphics.fillOval(rect.x, rect.y, 10, 10);
				}
			}
		}
	}
	
	private void paintDomino(Rectangle rect, DominoTile tile, Graphics graphics)
	{
		graphics.setColor(Color.white); //orange because if is white cant see it
		Rectangle rect1 = new Rectangle(rect.x , rect.y , rect.width / 2 , rect.height);
		graphics.drawRect(rect1.x, rect1.y, rect1.width, rect1.height);
		paintDominoDots(rect1, tile , graphics);
		//Graphics2D g = (Graphics2D) graphics;
		//g.fill3DRect(0, 0, 100, 100, true);
		//Rectangle2D.Double domino = new Rectangle2D.Double(15, 15, 10, 10);
		//domino.fillRect(15, 15, 10, 10);
	}
	
	private void paintDot(int x, int y, Graphics graphics)
	{
		graphics.fillOval(x, y, 15, 15);
	}
	
	@Override
	public void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		Rectangle rectangle = new Rectangle(0, 0, 100, 100);
		Deck<DominoTile> tile = table.getDominoTile();
		//needs to be finished
	}
	
	
}
