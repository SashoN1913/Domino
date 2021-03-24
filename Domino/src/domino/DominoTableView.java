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
		table.addTableEventListener(new TableEventListener() 
		{

			@Override
			public void onTableChanged(DominoTable dominoTable) 
			{
				DominoTableView.this.repaint();
			}
			
		})
		
		;
	}
	
	private void paintDominoDots(Rectangle rect, DominoTile tile, Graphics graphics)
	{
		char[][] pointsAtDomino = tile.createDomino(rect.x, rect.y);
		graphics.setColor(Color.black);
		//Rectangle rect1 = new Rectangle(rect.x, rect.y);
		int x = rect.x + 5;
		int y = rect.y + 5;
		for(int i = 0; i < pointsAtDomino.length; i++)
		{
			for(int j = 0; j < pointsAtDomino[i].length; j++)
			{
				if(pointsAtDomino[i][j] == '*')
				{
					graphics.fillOval(x, y, 10, 10);
				}
				x += 25;
			}
			
			x += rect.x + 5;
			y += 25;
		}
	}
	
	private void paintDomino(Rectangle rect, DominoTile tile, Graphics graphics)
	{
		graphics.setColor(Color.black); 
		Rectangle rect1 = new Rectangle(rect.x , rect.y , rect.width / 4 , rect.height / 2);
		graphics.drawRect(rect1.x, rect1.y, rect1.width, rect1.height);
		paintDominoDots(rect1, tile , graphics);
		//Graphics2D g = (Graphics2D) graphics;
		//g.fill3DRect(0, 0, 100, 100, true);
		//Rectangle2D.Double domino = new Rectangle2D.Double(15, 15, 10, 10);
		//domino.fillRect(15, 15, 10, 10);
	}
	
	
	@Override
	public void paintComponent(Graphics graphics)
	{
		Graphics2D g = (Graphics2D)graphics.create();
		g.setColor(Color.lightGray);
		Rectangle rect = new Rectangle(0, 0, 500, 500);
		g.fill(rect);
		Iterator<DominoTile> it = table.getDominoTile().getIterator();
		while(it.hasNext())
		{
			paintDomino(rect, it.next(), g);
			paintDominoDots(rect, it.next(), g);
		}
	}
	
	
}
