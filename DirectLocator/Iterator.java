import java.util.ArrayList;
import java.util.Iterator;
class Iterator1 
{
	public static void main(String[] args) 
	{
		//we will use an Iterator to traverse and print each element in an ArrayList.

		ArrayList<String> a = new ArrayList<>();
		
		a.add("a");
		a.add("b");
		a.add("c");

      // create iterator for  array list

	  Iterator<String> i = a.iterator();

	  //Iterate through element and print each element

	  while(i.hasNext()){
		  System.out.println(i.next());
	  }

	}
}
