package tree;

public class BinaryTree
{
	BinaryNode root;

	public BinaryTree(int start)
	{
		root = new BinaryNode(start);
	}

	public void add(BinaryNode curr, int val)
	{
		if(curr.value < val)
		{
			if(curr.left != null)
			{
				add(curr.left, val);
			}
			else
			{
				curr.left = new BinaryNode(val);
			}
		}
		else if(curr.value > val)
		{
			if(curr.right != null)
			{
				add(curr.right, val);
			}
			else
			{
				curr.right = new BinaryNode(val);
			}
		}
	}

	public void add(int val)
	{
		BinaryNode curr = root;

		while(true)
		{
			if(curr.value < val)
			{
				if(curr.left != null)
				{
					curr = curr.left;
				}
				else
				{
					curr.left = new BinaryNode(val);
					return;
				}
			}
			else if(curr.value > val)
			{
				if(curr.right != null)
				{
					curr = curr.right;
				}
				else
				{
					curr.right = new BinaryNode(val);
					return;
				}
			}
		}
	}

	public boolean has(int val)
	{
		//*** 4 ***
	}

	public void remove(int val)
	{
		//*** 8 ***
	}
}
