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

	public char[][] createDomino(int left , int right)
	{
		char [][] domino = new char[3][6];
		
		if(right != 1)
		{
			if(right >= 2)
			{
				domino[0][3] = '*';
				domino[2][5] = '*';
			}
			
			if(right >= 4 )
			{
				domino[0][5] = '*';
				domino[2][3] = '*';
			}
			
			if(right == 6)
			{
				domino[1][3] = '*';
				domino[1][5] = '*';
			}
		}
		
		if(left != 1)
		{
			if(left >= 2)
			{
				domino[0][0] = '*';
				domino[2][2] = '*';
			}
			
			if(left >= 4 )
			{
				domino[0][2] = '*';
				domino[2][0] = '*';
			}
			
			if(left == 6)
			{
				domino[1][0] = '*';
				domino[1][2] = '*';
			}
		}
		
		if(!(left % 2 == 0))
		{
			domino[1][1] = '*';
		}
		
		if(!(right % 2 == 0))
		{
			domino[1][4] = '*';
		}
		
		return domino;
	}
	
	public String toString()
	{
		char decimalCharArray [][] = createDomino(left , right);
		String printDomino = "";
		
		
		for(int row = 0;row < decimalCharArray.length;row ++)
		{
			for(int column = 0;column < decimalCharArray.length + 3;column ++)
			{
				printDomino += decimalCharArray[row][column];	
			}
			
			printDomino += "\n";
			
		}
		
		return printDomino;
		
	}

}
