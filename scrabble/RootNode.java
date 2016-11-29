package scrabble;

import java.util.LinkedList;

public class RootNode
{
	private WordNode root;
	
	public RootNode()
	{
		root = new WordNode();
	}
	
	private void insert(WordNode node, String word)
	{
		if(word.length() == 0)
		{
			//*** 2 ***
		}
		else
		{
			char letter = word.charAt(0);
			int index = letter - 'a';
			
			//*** 3 ***
		}
	}
	public void insert(String word)
	{
		this.insert(root, word);
	}
	
	private WordNode findNode(WordNode node, String word)
	{
		//*** 4 ***
	}
	
	public boolean isWord(String word)
	{
		WordNode node = findNode(root, word);
		//*** 5 ***
	}
	
	private LinkedList<String> complete(WordNode node, String word)
	{
		LinkedList<String> entries = new LinkedList<String>();
		if(node.isEnd)
			entries.add(word);
		
		//*** 6 ***
		
		return entries;
	}
	public String[] complete(String word)
	{
		WordNode start = findNode(root, word);
		LinkedList<String> entries = this.complete(start, word);
		return entries.toArray(new String[0]);
	}
}
