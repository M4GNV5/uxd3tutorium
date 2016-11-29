package scrabble;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		RootNode root = new RootNode();
		String line;
		
		BufferedReader br = new BufferedReader(new FileReader("words.txt"));
		while((line = br.readLine()) != null)
		{
			root.insert(line);
		}
		br.close();
		
		br = new BufferedReader(new InputStreamReader(System.in));
		while((line = br.readLine()) != null)
		{
			String[] split = line.trim().split(" ");
			
			if(split[0].equals("add"))
			{
				root.insert(split[1]);
				System.out.println("Added word");
			}
			else if(split[0].equals("has"))
			{
				if(root.isWord(split[1]))
					System.out.println("Is a word");
				else
					System.out.println("Not a word");
			}
			else if(split[0].equals("complete"))
			{
				String[] entries = root.complete(split[1]);
				for(int i = 0; i < entries.length; i++)
					System.out.print(entries[i] + " ");
				System.out.println();
			}
			else
			{
				System.out.println("Invalid input. Commands are add, has and complete");
			}
		}
		br.close();
	}
}
