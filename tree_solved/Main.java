package tree_solved;

import java.util.LinkedList;

public class Main
{
	public static void main(String[] args)
	{
		int length = 10000;
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		BinaryTree tree = new BinaryTree(length / 2);
		
		for(int i = 0; i < length; i++)
		{
			list.add(i);
			tree.add(i);
		}
		
		long start = System.currentTimeMillis();
		for(int i = 1; i <= length; i *= 10)
		{
			System.out.println("found " + list.indexOf(i - 1));
		}
		
		long time = System.currentTimeMillis() - start;
		System.out.println("List took " + time + "ms");
		
		start = System.currentTimeMillis();
		for(int i = 1; i <= length; i *= 10)
		{
			System.out.println("found " + tree.has(i - 1));
		}
		
		time = System.currentTimeMillis() - start;
		System.out.println("Tree took " + time + "ms");
	}
}
