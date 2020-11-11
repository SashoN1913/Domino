package domino;

public class DominoTile 
{
	
	private int left;
	private int right;
	
	public int getLeft()
	{
		return left;
	}
	
	public int getRight() 
	{
		return right;
	}
	
	public DominoTile()
	{
		left = 0;
		right = 0;
	}
	
	public DominoTile(int leftValue , int rightValue)
	{
		if(leftValue >= 0 && leftValue <= 6)
		{
			left = leftValue;
		}
		
		if(rightValue >= 0 && rightValue <= 6)
		{
			right = rightValue;
		}
	}
	
	public void swap()
	{
		int temp = left;
		left = right;
		right = temp;
	}
	
	public boolean equals(DominoTile domino)
	{
		boolean areEqual = false;
		
        if(right == domino.getRight() && left == domino.getLeft()) 
        {
            areEqual = true;
        }
        
        if(right == domino.getLeft() && left == domino.getRight())
        {
            areEqual = true;
        }
        
        return areEqual;
    }

	
	public String toString()
	{
		char decimalCharArray [][] = new char[3][6];
		
		for(int row = 0;row < decimalCharArray.length;row ++)
		{
			for(int column = 0;column < decimalCharArray.length;column ++)
			{
				
				
				
			}
		}
		
	}

}
