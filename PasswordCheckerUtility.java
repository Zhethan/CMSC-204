import java.util.ArrayList;
import java.lang.String;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*
* @author Ethan Yu
*/

/**
 * This is the constructor
 *
 */
public class PasswordCheckerUtility 
{
	
	//Constructor
	public PasswordCheckerUtility() 
	{	

	}
	
	   /**
     * This is the isValidPassword function, 
     *which checks if the password is valid
     *and throws exceptions
     */
	public static boolean isValidPassword(String passwordString) 
            throws LengthException,
                   NoDigitException,
                   NoUpperAlphaException,
                   NoLowerAlphaException,
                   InvalidSequenceException
	{

		if (passwordString.length() < 6) 
		{
			throw new LengthException("INVALID: Password length is less than 6 characters");
		
		//Regex: Check for digits
		}else if (!(passwordString.matches(".*\\d.*"))) 
		{
			throw new NoDigitException("INVALID: Password has no digits");
			
		//Regex: Check for uppercase	
		}else if (!(passwordString.matches(".*[A-Z].*"))) 
		{
			throw new NoUpperAlphaException("INVALID: Password has no uppercase");
		
		//Regex: Check for lowercase
		}else if (!(passwordString.matches(".*[a-z].*"))) 
		{
			throw new NoLowerAlphaException("INVALID: Password has no lowercase");
		
		//Check if there's duplicate characters
		}else if (duplicateChars(passwordString)) 
		{
			throw new InvalidSequenceException("INVALID: Password has Duplicate Characters");
		
		//Checks if the password is at least 6 characters
		}else if(passwordString.length() < 6) 
		{
			return false;
		
		//Regex: Checks if there's at least one special character
		}else if (!(passwordString.matches(".*[$&+,:;=\\\\?@#|/'<>.^*()%!-].*"))) 
		{
			return false;
		
		}else 
		{
			return true;
		}
	}
	
	   /**
     * This is the specialized isValidPassword function
     *specifically for the invalidPasswords function
     */
	public static boolean isValid(String passwordString) //xd
	{

		if (passwordString.length() < 6) 
		{
			return false;
		
		//Regex: Check for digits
		}else if (!(passwordString.matches(".*\\d.*"))) 
		{
			return false;
			
		//Regex: Check for uppercase	
		}else if (!(passwordString.matches(".*[A-Z].*"))) 
		{
			return false;
		
		//Regex: Check for lowercase
		}else if (!(passwordString.matches(".*[a-z].*"))) 
		{
			return false;
			
		//Check if there's duplicate characters
		}else if (duplicateChars(passwordString)) 
		{
			return false;
		}else if(passwordString.length() < 6) 
		{
			return false;
		}else 
		{
			return true;
		}
	}
	
	 /**
     * This is the isWeakPassword function
     *which checks if password is greater than or equal to 6 and lesser than or equal to 9
     */
	public static boolean isWeakPassword(String passwordString) 
	{

		
		if (passwordString.length() >= 6 && passwordString.length() <= 9 && isValid(passwordString)) 
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	/**
     * This is the invalidPasswords function
     *which returns an arraylist of invalid passwords
     */
	public static ArrayList<String> invalidPasswords(ArrayList<String> passwords)
	{

		
		ArrayList<String> invalids = new ArrayList<String>();
		
		for (int i = 0; i < passwords.size(); i++) 
		{
			if (isValid(passwords.get(i))) 
			{
			}else 
			{
				invalids.add(passwords.get(i));
				System.out.println(passwords.get(i));
			}
		}
		return invalids;
	}

	/**
     * This is the duplicateChars function
     *which checks if there's three duplicate characters
     */
	public static boolean duplicateChars(String password) 
	{

		
		char[] chars = password.toCharArray();
		
		for (int i = 0; i < chars.length; i++) 
		{
			int repeats = 0;
			for (int k = 0; k < chars.length; k++) 
			{
				if (chars[i] == chars[k] && i != k ) 
				{
					repeats++;
				}
			}
			if (repeats >= 2) 
			{
				return true;
			}
		}
		return false;
		
	}
}
