package domino;

public class DominoTable {
		public final int ARR_LENGHT = 28;
		
		private DominoTile [] dominos;
		private int index = 0;
		final static int LEFT = 0;
		final static int RIGHT = 1;
		
		public DominoTable()
		{
			dominos = new DominoTile [ARR_LENGHT];
			
		}
		
		public boolean addLeft(DominoTile tile)
		{
			if(index == ARR_LENGHT - 1)
			{
				return false;
			}
			
			if(tile.isPossible(dominos[0], LEFT) == true)
			{
				for(int i = index + 1;i > 0 ;i --)
				{
					dominos[i - 1] = dominos[i];
				}
				
				tile = dominos[0];
				index ++;
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
			
			if(tile.isPossible(dominos[0], RIGHT) == true)
			{
				tile = dominos[index + 1] ;
				
				dominos[0] = tile;
				index ++;
				return true;
			}
			
			return false;
		}
		
		public void print()
		{
			for(int i = 0;i < ARR_LENGHT;i ++)
			{
				if(!(dominos[i] == null))
				{
					System.out.println(dominos[i].toString());
				}
				
				else
				{
					break;
				}
			}
		}
}
