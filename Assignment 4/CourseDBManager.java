import java.io.File;
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class CourseDBManager implements CourseDBManagerInterface{

	CourseDBStructure struct = new CourseDBStructure(100);
	
	//Adds element
	@Override
	public void add(String id, int crn, int credits, String roomNum, String instructor) {
		
		CourseDBElement element = new CourseDBElement(id, crn, credits, roomNum, instructor);
		struct.add(element);
		
	}

	//retrieves element
	@Override
	public CourseDBElement get(int crn) throws IOException {
		return struct.get(crn);
	}

	//reads the file
	@Override
	public void readFile(File input) throws FileNotFoundException {
		
	      Scanner myReader = new Scanner(input);
	      while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	        }
	      myReader.close();
	}

	//displays the elements
	@Override
	public ArrayList<String> showAll() {
		ArrayList<String> output = new ArrayList<String>();
		
		for (LinkedList<CourseDBElement> x: struct.hashTable) 
		{
			if (!(x.isEmpty())) 
			{
				output.add(x.poll().toString());
			}
		}

		return output;
	}

}
