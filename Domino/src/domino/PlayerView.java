package domino;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JComponent;

public class PlayerView extends JComponent 
{
	private DominoPlayer player;
	
	public PlayerView(DominoPlayer player)
	{
		this.player = player;
	}
	
	@Override
	public void paintComponent(Graphics graphics)
	{
		/*
		Graphics2D g = (Graphics2D)graphics.create();
		g.setColor(Color.BLUE);
		Rectangle rect = new Rectangle(0, 0, 500, 500);
		g.fill(rect);
		int x = 60;
		int y = 220;
		Iterator<DominoTile> it = player.getDominoTile().iterator();
		while(it.hasNext())
		{
			g.translate(x, y);
			paintDomino(rect, it.next(), graphics);
			g.translate(-x,  -y);
			x += 120;
		}
		*/
	}
	
}
