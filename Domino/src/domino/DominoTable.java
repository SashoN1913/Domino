package domino;

import java.util.Iterator;

public class DominoTable {
		public final int ARR_LENGHT = 28;
		
		private Deck<DominoTile> dominos;
		private int index = 0;
		final static int LEFT = 0;
		final static int RIGHT = 1;
		private TableEventListener listener;
		
		public void addTableEventListener(TableEventListener listener)
		{
			if(listener != null)
			{
				this.listener = listener;
			}
		}
		
		public void onChange()
		{
			if(listener != null)
			{
				listener.onTableChanged(this);
			}
		}
		
		public DominoTable()
		{
			dominos = new Deck<>();
		}
		
		public Deck<DominoTile> getDominoTile()
		{
			return this.dominos;
		}
		
		public boolean addLeft(DominoTile tile)
		{
			if(index == ARR_LENGHT - 1)
			{
				return false;
			}
			
			if(dominos.isEmpty())
			{
				dominos.addLeft(tile);
				return true;
			}
			
			else if(dominos.getLeft().isPossible(tile, LEFT) == true)
			{
				dominos.addLeft(tile);
				onChange();
				return true;
			}
			
			return false;
		}
		
		public boolean addRight(DominoTile tile)
		{
			if(index == ARR_LENGHT - 1)
			{
				return false;
			}
			
			if(dominos.isEmpty())
			{
				dominos.addRight(tile);
				return true;
			}
			
			else if(dominos.getRight().isPossible(tile, RIGHT) == true)
			{
				dominos.addRight(tile);
				onChange();
				return true;
			}
			
			return false;
		}
		
		public void print()
		{
			Iterator<DominoTile> it = dominos.getIterator();
			
			while(it.hasNext())
			{
				DominoTile t = it.next();
				System.out.print(t.toString());
			}
			
		}
}
