import java.util.ArrayList;

public class SimpleList
{

	//declare variables here
	int count;
	ArrayList<Integer> list;
	
	
	
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
	
	/* If the parameter is in the list, then remove it. The other values in the list 
	 * may need to be moved down. Adjust the count as needed.*/
	public void remove(int num)
	{
		int numSearch = search(num);
		if(numSearch != -1)
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
