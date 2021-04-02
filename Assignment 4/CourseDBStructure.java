import java.util.ArrayList;
import java.util.LinkedList;
import java.io.IOException;

public class CourseDBStructure implements CourseDBStructureInterface{
	
	public LinkedList<CourseDBElement>[] hashTable;

	public CourseDBStructure(int i) 
	{
		hashTable = new LinkedList[i];
		for (int k = 0; k < i; k++) 
		{
			hashTable[k] = new LinkedList<CourseDBElement>();
		}
	}
	
	public CourseDBStructure(String randomstringthatdoesntdoanything, int i) 
	{
		hashTable = new LinkedList[i];
		for (int k = 0; k < i; k++) 
		{
			hashTable[k] = new LinkedList<CourseDBElement>();
		}
	}
	
	//Adds an element
	@Override
	public void add(CourseDBElement element) {
		// TODO Auto-generated method stub
		element.hashcode = element.getCRN() % hashTable.length;
		int index = element.hashCode() % hashTable.length;
		hashTable[index].add(element);
	}

	//Retrieves an element
	@Override
	public CourseDBElement get(int crn) throws IOException {
		return hashTable[crn % hashTable.length].poll();
	}

	//Returns size
	@Override
	public int getTableSize() {
		return hashTable.length;
	}

}
 