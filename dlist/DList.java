package dlist;

public class DList<T>
{
	DListEntry<T> head;
	
	//helper function for insert, get and set
	//returns the DListEntry at 'index'
	public DListEntry<T> getEntryAt(int index)
	{
		DListEntry<T> curr = head; //'curr' is for iterating over the list
		for(int i = 0; i != index; i++) //iterate to the element at 'index
		{
			curr = curr.next; //advance to the next entry
		}
		
		return curr;
	}

	public void insert(int index, T value)
	{
		//elements: head -> A <-> B <-> C <-> D
		//index   :         0     1     2     3
		//we want to insert between B and C (index = 1)
		//=> for the new entry we need a 'prev' and a 'next'
		//=> in this case 'prev' is B or index 1
		//   and 'next' is C or index 2 or B.next
		
		//get the entry before the 
		DListEntry<T> prev = getEntryAt(index); //find B
		DListEntry<T> next = prev.next; //get B
		
		//create entry and set its 'value', 'prev' and 'next'
		DListEntry<T> entry = new DListEntry<T>();
		entry.value = value;
		entry.prev = prev;
		entry.next = next;
		
		//now entry is correctly set up however B
		//	and C are still pointing to themselves
		//thus we now have to set B.next and C.prev
		//it looks like this:
		//head -> A <-> B <-> C <-> D
		//               ↖   ↗
		//               entry
		prev.next = entry;
		next.prev = entry;
	}
	
	T get(int index)
	{
		//use the helper function to get the entry at 'index'
		DListEntry<T> curr = getEntryAt(index);
		
		//return the value of the entry
		return curr.value;
	}
	
	void set(int index, T value)
	{
		//use the helper function to get the entry at 'index'
		DListEntry<T> curr = getEntryAt(index);
		
		//set the value of the entry
		curr.value = value;
	}
	
	public void remove(int index) //*** 5 ***
	{
		//at the start our list looks like this
		//A <-> B <-> C
		
		//to find B (aka curr) we use getEntryAt
		DListEntry<T> curr = getEntryAt(index);
		
		//now we need to set A's next to B
		//	and B's next to A
		//we can access A via curr.prev
		//			and B via curr.next
		curr.prev.next = curr.next;
		curr.next.prev = curr.prev;
		
		//now it looks like this
		//head -> A <-> C
		//         ↖   ↗
		//           B
		
		//as there is no arrow to B anymore, B is lost and its
		//	memory will be free'd by the garbage collector
	}
	
	public int length()
	{
		//iterate over the list and count how many steps we made
		int len = 0;
		
		DListEntry<T> curr = head; //'curr' is for iterating over the list
		while(curr != null) //we iterate over the list until we reach the end
		{
			len++; //count how often we advance
			curr = curr.next; //advance one
		}
		
		return len;
	}
}
