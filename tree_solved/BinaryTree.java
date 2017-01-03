package tree_solved;

public class BinaryTree
{
	BinaryNode root;

	public BinaryTree(int start)
	{
		root = new BinaryNode(start);
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
			else
			{
				return;
			}
		}
	}

	public boolean has(int val)
	{
		BinaryNode curr = root;

		while(curr != null)
		{
			if(curr.value < val)
			{
				curr = curr.left;
			}
			else if(curr.value > val)
			{
				curr = curr.right;
			}
			else
			{
				return true;
			}
		}
		
		return false;
	}

	public void remove(int val)
	{
		//*** 8 ***
	}
}
