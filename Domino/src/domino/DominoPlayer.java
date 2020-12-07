package domino;

public class DominoPlayer 
{
	private String nickname;
	private DominoTile[] tiles;
	private int tilesInHands;
	private DominoTable table;
	
	public void setNickname(String nickname)
	{
		if(nickname.isEmpty() && nickname != null)
		this.nickname = nickname;
	}
	
	public String getNickname()
	{
		return this.nickname;
	}
	
	public DominoTile[] getDominoTile()
	{
		return this.tiles;
	}
	
	public void setDominoTile(DominoTile[] tiles)
	{
		this.tiles = tiles;
	}
	
	public int getTilesHands()
	{
		return this.tilesInHands;
	}
	
	public void setTilesHands(int tilesHands)
	{
		this.tilesInHands = tilesHands;
	}
	
	public DominoTable getTable()
	{
		return this.table;
	}
	
	public void setTable(DominoTable table)
	{
		this.table = table;
	}
	
	private int getTileIndex(DominoTile t)
	{
		for(int i = 0;i < tiles.length;i ++)
		{
			if(tiles[i] == null)
			{
				continue;
			}
			if(tiles[i] == t)
			{
				return i;
			}
		}
		return -1;
	}
	
	public void addTileAtLeft(DominoTile t)
	{
		if(getTileIndex(t) >= 0 && table.addLeft(t))
		{
			tiles[getTileIndex(t)] = null;
			this.tilesInHands--;
		}
	}
	
	public void addTileAtRight(DominoTile t)
	{
		if(getTileIndex(t) >= 0 && table.addRight(t))
		{
			tiles[getTileIndex(t)] = null;
			this.tilesInHands--;
		}
	}
}
