// Owen Girimonte pd 7 10/1/2024
import WordSorterManager.WordSorterManager;
import java.io.File;
import java.util.Scanner;
public class WordSorter 
{
	public static void main(String[] args) 
	{
		WordSorterManager wordSorterManager = new WordSorterManager();
		Scanner in = new Scanner(System.in); 
		try
		{
			in = new Scanner(new File("article.txt"));	
		}
		catch(Exception e)
		{
			System.out.println("Cannot find file... Exiting Program");
			return;
		}	
		String word = "";
		while(in.hasNext())
		{
			word = in.next();
			word = word.replace(",", "");
			word = word.replace("(tm)", "");
			word = word.replace(")", "");
			word = word.replace("(", "");
			word = word.replace(".", "");
			word = word.replace("'s", "");
			word = word.replace(":", "");
			word = word.replace("!", "");
			word = word.replace("?", "");
			word = word.replace("'", "");			
			wordSorterManager.add(word);
		}
		wordSorterManager.getInput();
	}
}