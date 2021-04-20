//Ethan Yu (not you, me!)

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MorseCodeConverter {

	private static MorseCodeTree tree = new MorseCodeTree();
	
	public static String convertToEnglish(String string) {
		String code = "";
		String message = "";
		
		for (int i = 0; i < string.length(); i++) 
		{
			while (!(string.charAt(i) == ' ')) 
			{
				code += String.valueOf(string.charAt(i));
				if (string.charAt(i) == '/') 
				{
					i++;
					code = code.substring(0, code.length()-1);
					message += " ";
				}
				i++;
			}
			
			message += tree.fetch(code);
			code = "";
		}
		return message;
	}

	public static String convertToEnglish(File inputFile) throws FileNotFoundException {
		String output = "";
		Scanner scan = new Scanner(inputFile);
		output = scan.nextLine() + " ";
		return convertToEnglish(output);
	}

	public static String printTree() {
		String output = "";
		ArrayList<String> list = tree.toArrayList();
		for (String x: list) 
		{
			output += x + " ";
			System.out.println(x);
		}
		return output;
	}
	
}
