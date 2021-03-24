package domino;

import java.util.ArrayList;

public class DominoPlayer 
{
	private String nickname;
	private ArrayList<DominoTile> tiles;
	private int tilesInHands;
	private DominoTable table;
	
	public void setNickname(String nickname)
	{
		if(!(nickname.isEmpty()) && !(nickname.equals(null)))
		this.nickname = nickname;
	}
	
	public String getNickname()
	{
		return this.nickname;
	}
	
	public ArrayList<DominoTile> getDominoTile()
	{
		return this.tiles;
	}
	
	public void setDominoTile(ArrayList<DominoTile> tiles)
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
	
	
	public void addTileAtLeft(DominoTile t)
	{
		table.addLeft(t);
		tiles.remove(t);
	}
	
	public void addTileAtRight(DominoTile t)
	{
		table.addRight(t);
		tiles.remove(t);
	}
}
