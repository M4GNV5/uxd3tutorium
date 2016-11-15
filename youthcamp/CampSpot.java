package youthcamp;

import java.util.Random;

public class CampSpot
{
	public static void main(String[] args)
	{
		CampSpot spot = new CampSpot(10, 10);
		
		spot.placeTrees(10);
		spot.placeCamps(3);
		
		spot.printField();
		
		System.out.println("hi: " + spot.board[3]);
	}
	
	
	int width;
	int height;
	BoardEntry[][] board;
	Random rnd = new Random();
	
	public CampSpot(int width, int height)
	{
		this.width = width;
		this.height = height;
		board = new BoardEntry[width][height];
		
		for(int x = 0; x < width; x++)
		{
			for(int y = 0; y < height; y++)
			{
				board[x][y] = BoardEntry.None;
			}
		}
	}
	
	void placeTrees(int count)
	{
		while(count > 0)
		{
			int x = rnd.nextInt(width);
			int y = rnd.nextInt(height);
			if(board[x][y] == BoardEntry.None)
			{
				board[x][y] = BoardEntry.Tree;
				count--;
			}
		}
	}
	
	void placeCamps(int count)
	{
		while(count > 0)
		{
			int x = rnd.nextInt(width);
			int y = rnd.nextInt(height);
			if(board[x][y] == BoardEntry.None
				&& !isNextTo(x, y, BoardEntry.Camp)
				&& isNextTo(x, y, BoardEntry.Tree))
			{
				board[x][y] = BoardEntry.Camp;
				count--;
			}
		}
	}
	
	void printField()
	{
		for(int y = 0; y < height; y++)
		{
			for(int x = 0; x < width; x++)
			{
				switch(board[x][y])
				{
				case None:
					System.out.print(' ');
					break;
				case Tree:
					System.out.print('T');
					break;
				case Camp:
					System.out.print('X');
					break;
				}
			}
			System.out.println();
		}
	}
	
	boolean isNextTo(int x, int y, BoardEntry type)
	{
		if(x > 0 && board[x - 1][y] == type
			|| y > 0 && board[x][y - 1] == type
			|| x < width - 1 && board[x + 1][y] == type
			|| y < height - 1 && board[x][y + 1] == type)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public String toString()
	{
		return "";
		
	}
}
