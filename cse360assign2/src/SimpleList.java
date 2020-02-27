public class SimpleList
{

	
//	public static void main(String[] args) {}
	
	//this is the 3rd change for test
	
	
	//declare variables here
	int count;
	int[] list;
	
	//constructor to initialize count to 0, and set array size of list
	public SimpleList()
	{
		this.list = new int[10];
		this.count = 0;
	}
	
	/*Add the parameter to the list at the beginning (index = 0). Move all the
	other integers in the list over so there is room. If the list was full, then the last element
	“falls off” the list. Increment the count as needed.*/
	public void add(int num)
	{
		if(this.count > 0)
		{
			for(int index = this.list.length - 1; index > 0; index--)
			{
				if(this.list.length == 10)
				{
					this.list[index] = this.list[index-1];
				}
				else
				{
					this.list[index + 1] = this.list[index];
				}
			}
		}
		this.list[0] = num;
		if(this.count < 10)
		{
			this.count++;
		}
	}
	
	/* If the parameter is in the list, then remove it. The other values in the list 
	 * may need to be moved down. Adjust the count as needed.*/
	public void remove(int num)
	{
		int numSearch = search(num);
		if(numSearch != -1)
		{
			for(int index = 0; index < numSearch; index ++)
			{
				if(this.list[index] == num)
				{
					
				}
			}
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
			listString = listString + this.list[index];
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
		int numMatch = -1;
		for(int index = 0; index < this.count; index ++)
		{
			if(this.list[index] == num)
			{
				numMatch = index;
			}
		}
		return numMatch;
	}
}
