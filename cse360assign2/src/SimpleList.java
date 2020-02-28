import java.util.ArrayList;

public class SimpleList
{

	//declare variables here
	int count;
	ArrayList<Integer> list;
	
	
	/*  TEST CASE BELOW IF NEEDED  */
//	public static void main(String[] args) {
//		
//		SimpleList list2 = new SimpleList();
//		
//		System.out.println(list2.size());
//		list2.add(1);
//		list2.add(2);
//		list2.add(3);
//		list2.add(4);
//		list2.add(5);
//		list2.add(6);
//		System.out.println(list2.size());
//		System.out.println(list2.toString());
//		list2.remove(4);
//		System.out.println(list2.toString());
//		list2.append(40);
//		System.out.println(list2.toString());
//		System.out.println(list2.size());
//		System.out.println(list2.first());
//		System.out.println(list2.last());
//		System.out.println(list2.count);
//		list2.remove(30);
//		System.out.println(list2.toString());
//		System.out.println(list2.search(1));
//		System.out.println(list2.search(7));
//		list2.remove(2);
//		list2.remove(3);
//		list2.remove(4);
//		list2.remove(5);
//		list2.remove(6);
//		list2.remove(40);
//		System.out.println(list2.toString());
//		System.out.println(list2.size());
//		System.out.println(list2.first());
//		list2.remove(1);
//		list2.add(2);
//		list2.remove(1);
//		System.out.println(list2.toString());
//		list2.remove(2);
//		System.out.println(list2.toString());
//	}
	
	
	//constructor to initialize count to 0, and set array size of list
	public SimpleList()
	{
		this.list =  new ArrayList<Integer>();
		this.count = 0;
	}
	
	/*Add the parameter to the list at the beginning (index = 0). Move all the
	other integers in the list over so there is room. If the list was full, then the last element
	“falls off” the list. Increment the count as needed.*/
	public void add(int num)
	{
		this.list.add(0, num); //add the new number to the 0 element, moving the rest + 1
		this.count += 1; 
	}
	
	/*
	 * The append method should append the parameter to the end of the list.  If the list 
	 * was full, then increase the size by 50% so there will be room.  Increment the count. */
	public void append(int num)
	{
		this.list.add(num);
		this.count += 1;
	}
	
	//Return the first element in the list. If there are no elements n the list, then return -1.
	public int first()
	{
		if(this.list.get(0) == null)
			return -1;
		else
			return this.list.get(0);
	}
	
	//Return the last element in the list.  If there are no elements n the list, then return -1.
	public int last()
	{
		if(this.list.get(0) == null)
			return -1;
		else
			return this.list.get(this.count - 1);
	}
	
	//Return the current number of possible locations in the list
	public int size()
	{
		return this.list.size();
	}
	
	/* If the parameter is in the list, then remove it. The other values in the list 
	 * may need to be moved down. Adjust the count as needed. List cannot be reduced to less 
	 * than 1 entry*/
	public void remove(int num)
	{
		int numSearch = search(num);
		if(numSearch != -1 && count > 0)
		{
			this.list.remove(numSearch);
			this.count -= 1;	
		}
	}
	
	//returns the count(i.e. number of elements) in the array
	public int count()
	{
		return this.count;
	}
	
	/* Return the list as a String. The elements must be separated by a space. This 
	 * means there is not space after the last integer.*/
	public String toString()
	{
		
		String listString = "";
		for(int index = 0; index < this.count; index++)
		{
			listString = listString + this.list.get(index);
			if(index != this.count -1)
			{
				listString = listString + " ";
			}
		}
		return listString;
	}
	
	/*Return the location of the parameter in the list. If the parameter is not
	in the list, then return -1*/
	public int search(int num)
	{
		int indexSearch = this.list.indexOf(num);
		return indexSearch;
	}
}