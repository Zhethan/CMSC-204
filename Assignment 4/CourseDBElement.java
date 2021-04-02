
public class CourseDBElement implements Comparable {
	

//Data Element - CourseDBElement, 
//CourseDBElement implements Comparable, and consists of five attributes: the Course ID (a String), the CRN (an int),
//the number of credits (an int), the room number (a String), and the instructor name (a String).  
//Normally the CourseDBElement will be an object consisting of these five attributes, and is referred to as a CDE.

	public String id;
	public String room;
	public String instructor;
	public int crn, credits;
	public int hashcode;
	
	public CourseDBElement(String id, int crn, int credits, String room, String instructor) 
	{
		this.id = id;
		this.crn = crn;
		this.credits = credits;
		this.room = room;
		this.instructor = instructor;
	}
	
	public CourseDBElement() 
	{
		
	}
	
	//Gets CRN
    public int getCRN() {
        return this.crn;
    }
    
	@Override
	public int compareTo(Object o) {
		return 0;
	}

	//Returns the hashcode
	public int hashCode() 
	{
		return this.hashcode;
	}
	
	//Sets crn
	public void setCRN(int crn) 
	{
		this.crn = crn;
	}
	
	//Formats toString
	public String toString() 
	{
		return "\nCourse:" + id + " CRN:" + crn + " Credits:" + credits + " Instructor:" + instructor + " Room:" + room;
		
	}
}
